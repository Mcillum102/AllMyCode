import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class HeartPumpingGUI extends JPanel {
    private double scale = 1.0;
    private boolean growing = true;

    public HeartPumpingGUI() {
        Timer timer = new Timer(100, e -> {
            if (growing) {
                scale += 0.05;
                if (scale >= 1.2) growing = false;
            } else {
                scale -= 0.05;
                if (scale <= 0.9) growing = true;
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        g2.setColor(Color.RED);

        Path2D heart = new Path2D.Double();
        for (double t = 0; t <= 2 * Math.PI; t += 0.1) {
            double x = 16 * Math.pow(Math.sin(t), 3);
            double y = 13 * Math.cos(t) - 5 * Math.cos(2 * t) - 2 * Math.cos(3 * t) - Math.cos(4 * t);
            x *= scale;
            y *= scale;
            if (t == 0) heart.moveTo(x, -y);
            else heart.lineTo(x, -y);
        }
        heart.closePath();

        g2.translate(width / 2, height / 2);
        g2.fill(heart);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pumping Heart");
        HeartPumpingGUI heartPanel = new HeartPumpingGUI();
        frame.add(heartPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
