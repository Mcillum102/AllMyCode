import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ImagePanel extends JPanel {
    public ImagePanel(String labelTest, String buttonText, JPanel mainPanel, CardLayout cardLayout) {
        setLayout(new BorderLayout());

        JLabel test = new JLabel(labelTest);
        JButton switchButton = new JButton(buttonText);
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(mainPanel);
            }
        });
        add(switchButton, BorderLayout.SOUTH);
        add(test, BorderLayout.CENTER);
    }
}
