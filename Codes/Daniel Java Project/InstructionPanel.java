import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InstructionPanel extends JPanel {
    private JButton startButton;

    public InstructionPanel(ActionListener startButtonListener) {
        setLayout(new BorderLayout());

        JPanel wordPanel = new JPanel(new GridBagLayout());
        wordPanel.setOpaque(false);
        JLabel instructions = new JLabel("<html><div style='text-align: center; padding: 20px;'>" +
                "<h1 style='color: #2E8B57;'>Welcome to the Solar System Simulation!</h1>" +
                "<p style='font-size: 16px;'>Click the button below to start exploring the solar system.</p>" +
                "</div></html>");
        instructions.setHorizontalAlignment(SwingConstants.CENTER);
        wordPanel.add(instructions);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setOpaque(false);
        startButton = new JButton("Go to Simulator");
        startButton.setPreferredSize(new Dimension(200, 50));
        startButton.addActionListener(startButtonListener);

        buttonPanel.add(startButton);
        add(buttonPanel, BorderLayout.SOUTH);
        add(wordPanel, BorderLayout.CENTER);
    }
}