import java.awt.image.BufferedImage;

public class Planet {
    private String name;
    private String imagePath;
    private double distance;
    private double speed;
    private double angle;
    private BufferedImage image;

    public Planet(String name, String imagePath, double distance, double speed) {
        this.name = name;
        this.imagePath = imagePath;
        this.distance = distance;
        this.speed = speed;
        this.angle = Math.random() * 2 * Math.PI; 
    }

    public void updatePosition(double speedMultiplier) {
        angle += speed * speedMultiplier;
        if (angle > 2 * Math.PI) {
            angle -= 2 * Math.PI;
        }
    }

    public String getName() {
        return name;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public double getDistance() {
        return distance;
    }

    public double getSpeed() {
        return speed;
    }

    public double getAngle() {
        return angle;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}