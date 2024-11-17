import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Solar System Simulator");
        SolarSystemPanel solarSystemPanel = new SolarSystemPanel();
        frame.add(solarSystemPanel);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
