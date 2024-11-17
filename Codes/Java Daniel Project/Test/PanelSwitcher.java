import javax.swing.*;
import java.awt.*;

public class PanelSwitcher extends JFrame {
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public PanelSwitcher() {
        setTitle("Panel Switcher");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        ImagePanel panel1 = new ImagePanel("This is Instructions", "Go to Simulator", mainPanel, cardLayout);
        SolarSystemPanel solarSystemPanel = new SolarSystemPanel();

        mainPanel.add(panel1, "Panel 1");
        mainPanel.add(solarSystemPanel);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PanelSwitcher().setVisible(true));
    }
}
