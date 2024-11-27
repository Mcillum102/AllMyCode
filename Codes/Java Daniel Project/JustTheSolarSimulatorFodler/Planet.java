package JustTheSolarSimulatorFodler;

public class Planet {
    private String name;
    private String imagePath;
    private double angle;
    private int orbitRadius;
    private double speed;
    private Planet parent;

    public Planet(String name, String imagePath, int orbitRadius, double speed) {
        this.name = name;
        this.imagePath = imagePath;
        this.orbitRadius = orbitRadius;
        this.speed = speed;
        this.angle = 0;
    }

    public Planet(String name, String imagePath, int orbitRadius, double speed, Planet parent) {
        this.name = name;
        this.imagePath = imagePath;
        this.orbitRadius = orbitRadius;
        this.speed = speed;
        this.angle = 0;
        this.parent = parent;
    }

    public void updatePosition() {
        angle += speed;
        if (angle > 2 * Math.PI) {
            angle = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return (int) (orbitRadius * Math.cos(angle));
    }

    public int getY() {
        return (int) (orbitRadius * Math.sin(angle));
    }

    public int getEarthX() {
        return parent.getX() + (int) (orbitRadius * Math.sin(angle));
    }

    public int getEarthY() {
        return parent.getY() + (int) (orbitRadius * Math.cos(angle));
    }

    public String getImagePath() {
        return imagePath;
    }
}
