import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class SolarSystemPanel extends JPanel implements Runnable {
    private List<Planet> planets;
    private Planet earth;
    private Planet moon;
    private BufferedImage background;
    private BufferedImage sunImage;
    private double moonAngle = 0;
    private JSlider speedSlider; 
    private double speedMultiplier = 1.0;  
    private JPanel sliderPanel;
    private double zoomFactor = 1.0;

    // public SolarSystemPanel() {
    //     planets = new ArrayList<>();
    //     loadPlanets();
    //     loadImages();

    //     setLayout(new BorderLayout());  

    //     speedSlider = new JSlider(1, 500, 100);  
    //     speedSlider.setPaintTicks(true);
    //     speedSlider.setPaintLabels(true);
    //     speedSlider.setMajorTickSpacing(100);
    //     speedSlider.setMinorTickSpacing(10);
    //     speedSlider.addChangeListener(e -> speedMultiplier = speedSlider.getValue() / 100.0);

    //     sliderPanel = new JPanel(new BorderLayout());
    //     sliderPanel.add(speedSlider);
    //     sliderPanel.setPreferredSize(new Dimension(200,50));

        
    //     add(speedSlider, BorderLayout.SOUTH); 
    //     // add(sliderPanel);

    //     Thread animationThread = new Thread(this);
    //     animationThread.start();
    // }

    public SolarSystemPanel() {
        planets = new ArrayList<>();
        loadPlanets();
        loadImages();

        setLayout(new BorderLayout());

        addMouseWheelListener(e -> {
            if (e.getPreciseWheelRotation() < 0 && zoomFactor < 2.0) {
                zoomFactor += 0.1;
            } else if (e.getPreciseWheelRotation() > 0 && zoomFactor > 0.5) {
                zoomFactor -= 0.1;
            }
            repaint();
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (Planet planet : planets) {
                    int centerX = getWidth() / 2;
                    int centerY = getHeight() / 2;
                    int planetX = centerX + (int) (planet.getDistance() * zoomFactor * Math.cos(planet.getAngle()));
                    int planetY = centerY + (int) (planet.getDistance() * zoomFactor * Math.sin(planet.getAngle()));

                    if (Math.hypot(e.getX() - planetX, e.getY() - planetY) < 20) {
                        JOptionPane.showMessageDialog(SolarSystemPanel.this,
                                "Planet: " + planet.getName() + "\n" +
                                "Orbit Speed: " + planet.getSpeed() + "\n" +
                                "Orbit Distance: " + planet.getDistance(),
                                "Planet Info", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
            }
        });

        // Create the slider
        speedSlider = new JSlider(1, 500, 100);  
        speedSlider.setPaintTicks(true);
        speedSlider.setPaintLabels(true);
        speedSlider.setMajorTickSpacing(100);
        speedSlider.setMinorTickSpacing(10);
        speedSlider.addChangeListener(e -> speedMultiplier = speedSlider.getValue() / 100.0);

        add(speedSlider, BorderLayout.SOUTH);
        // Create a panel for the slider
        sliderPanel = new JPanel(new BorderLayout());
        sliderPanel.add(speedSlider, BorderLayout.CENTER);
        sliderPanel.setPreferredSize(new Dimension(200, 50));
        sliderPanel.setBorder(BorderFactory.createTitledBorder("Speed Control"));

        // Create a container for placing the slider in the bottom-left corner
        JPanel bottomLeftContainer = new JPanel(new BorderLayout());
        bottomLeftContainer.add(sliderPanel, BorderLayout.SOUTH);

        // Add the container to the main panel
        add(bottomLeftContainer, BorderLayout.SOUTH);


        Thread animationThread = new Thread(this);
        animationThread.start();
    }
 
    private void loadPlanets() {
        planets.add(new Planet("Mercury", "images/mercury.png", 60, 0.02));
        planets.add(new Planet("Venus", "images/venus.png", 90, 0.015));
        earth = new Planet("Earth", "images/earth.png", 120, 0.01);
        planets.add(earth);
        planets.add(new Planet("Mars", "images/mars.png", 150, 0.008));
        planets.add(new Planet("Jupiter", "images/jupiter.png", 180, 0.005));
        planets.add(new Planet("Saturn", "images/saturn.png", 210, 0.004));
        planets.add(new Planet("Uranus", "images/uranus.png", 240, 0.003));
        planets.add(new Planet("Neptune", "images/neptune.png", 280, 0.002));
        planets.add(new Planet("Pluto", "images/pluto.png", 330, 0.001));
        moon = new Planet("Moon", "images/moon.png", 20, 0.04); // Moon relative to Earth
    }
 
    private void loadImages() {
        background = loadImage("images/space.png");
        sunImage = loadImage("images/sun.png");
        for (Planet planet : planets) {
            planet.setImage(loadImage(planet.getImagePath()));
        }
        moon.setImage(loadImage(moon.getImagePath()));
    }

    private BufferedImage loadImage(String imagePath) {
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void run() {
        while (true) {
            for (Planet planet : planets) {
                planet.updatePosition(speedMultiplier); 
            }

            moonAngle += moon.getSpeed() * speedMultiplier;
            if (moonAngle > 2 * Math.PI) {
                moonAngle -= 2 * Math.PI;
            }
            repaint();

            try {
                Thread.sleep(16); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // @Override
    // protected void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    //     Graphics2D g2d = (Graphics2D) g;

    //     g2d.drawImage(background, 0, 0, getWidth(), getHeight(), null);

    //     int sunX = getWidth() / 2 - 50;
    //     int sunY = getHeight() / 2 - 50;
    //     g2d.drawImage(sunImage, sunX, sunY, 100, 100, null);

    //     int centerX = getWidth() / 2;
    //     int centerY = getHeight() / 2;
    //     for (Planet planet : planets) {
    //         int planetX = centerX + (int) (planet.getDistance() * Math.cos(planet.getAngle()));
    //         int planetY = centerY + (int) (planet.getDistance() * Math.sin(planet.getAngle()));
    //         g2d.drawImage(planet.getImage(), planetX - 20, planetY - 20, 40, 40, null);

    //         if (planet == earth) {
    //             int moonX = planetX + (int) (moon.getDistance() * Math.cos(moonAngle));
    //             int moonY = planetY + (int) (moon.getDistance() * Math.sin(moonAngle));
    //             g2d.drawImage(moon.getImage(), moonX - 10, moonY - 10, 20, 20, null);
    //         }
    //     }
    // }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = (int) (getWidth());
        int height = (int) (getHeight());
        g2d.drawImage(background, 0, 0, width, height, null);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int sunSize = (int) (100 * zoomFactor);
        g2d.drawImage(sunImage, centerX - sunSize / 2, centerY - sunSize / 2, sunSize, sunSize, null);

        for (Planet planet : planets) {
            int planetX = centerX + (int) (planet.getDistance() * zoomFactor * Math.cos(planet.getAngle()));
            int planetY = centerY + (int) (planet.getDistance() * zoomFactor * Math.sin(planet.getAngle()));
            int planetSize = (int) (40 * zoomFactor);
            g2d.drawImage(planet.getImage(), planetX - planetSize / 2, planetY - planetSize / 2, planetSize, planetSize, null);

            if (planet == earth) {
                int moonX = planetX + (int) (moon.getDistance() * zoomFactor * Math.cos(moonAngle));
                int moonY = planetY + (int) (moon.getDistance() * zoomFactor * Math.sin(moonAngle));
                int moonSize = (int) (20 * zoomFactor);
                g2d.drawImage(moon.getImage(), moonX - 10, moonY - 10, moonSize, moonSize, null);
            }
        }
    }
}
 