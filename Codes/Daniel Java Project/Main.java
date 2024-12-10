import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel mainPanel;
    private InstructionPanel instructionPanel;
    private SolarSystemPanel solarSystemPanel;

    public Main() {
        setTitle("Solar System Simulation");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new BorderLayout());

        instructionPanel = new InstructionPanel(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                instructionPanel.setVisible(false);
                showSolarSystem();
            }
        });

        mainPanel.add(instructionPanel, BorderLayout.CENTER);

        add(mainPanel);
    }

    private void showSolarSystem() {
        solarSystemPanel = new SolarSystemPanel();
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.setOpaque(false); // Make the top panel transparent
        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(100, 50));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solarSystemPanel.setVisible(false);
                instructionPanel.setVisible(true);
                revalidate();
                repaint();
            }
        });
        topPanel.add(backButton);

        solarSystemPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(solarSystemPanel, BorderLayout.CENTER);
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