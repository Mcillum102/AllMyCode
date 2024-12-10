import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel mainPanel;

    public Main() {
        setTitle("Solar System Simulation");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
 
        mainPanel = new JPanel(new BorderLayout());
 
        JPanel instructionPanel = new JPanel(new BorderLayout());
        JLabel instructions = new JLabel("<html><center>Welcome to the Solar System Simulation!<br>" +
                "Click the button below to start exploring the solar system.</center></html>");
        instructions.setHorizontalAlignment(SwingConstants.CENTER);
        JButton startButton = new JButton("Go to Simulator");

        instructionPanel.add(instructions, BorderLayout.CENTER);
        instructionPanel.add(startButton, BorderLayout.SOUTH);
 
        mainPanel.add(instructionPanel, BorderLayout.CENTER);
 
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                instructionPanel.setVisible(false);
                showSolarSystem();
            }
        });

        add(mainPanel);
    }

    private void showSolarSystem() {
        SolarSystemPanel solarSystemPanel = new SolarSystemPanel();
        mainPanel.add(solarSystemPanel);
        revalidate();  
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main mainFrame = new Main();
            mainFrame.setVisible(true);
        });
    }
}