package JustTheSolarSimulatorFodler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SolarSystemPanel extends JPanel implements Runnable {
    private List<Planet> planets;

    public SolarSystemPanel() {
        planets = new ArrayList<>();
        loadPlanets();

        Thread animationThread = new Thread(this);
        animationThread.start();
    }

    private void loadPlanets() {
        planets.add(new Planet("Mercury", "JustTheSolarSimulatorFodler/images/mercury.png", 60, 0.01));
        planets.add(new Planet("Venus", "JustTheSolarSimulatorFodler/images/venus.png", 90, 0.008));
        planets.add(new Planet("Earth", "JustTheSolarSimulatorFodler/images/earth.png", 120, 0.007));
        planets.add(new Planet("Mars", "JustTheSolarSimulatorFodler/images/mars.png", 500, 0.006));
    }

    @Override
    public void run() {
        while (true) {
            for (Planet planet : planets) {
                planet.updatePosition();
            }
            repaint();

            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int sunX = getWidth() / 2 - 25;
        int sunY = getHeight() / 2 - 25;
        g2d.drawImage(loadImage("JustTheSolarSimulatorFodler/images/sun.png"), sunX, sunY, 50, 50, null);

        
        for (Planet planet : planets) {
            int x = getWidth() / 2 + planet.getX() - 10;
            int y = getHeight() / 2 + planet.getY() - 10;
            g2d.drawImage(loadImage(planet.getImagePath()), x, y, 20, 20, null);
        }
    }

    public static Image loadImage(String path) {
        return new ImageIcon(path).getImage();
    }
}

    