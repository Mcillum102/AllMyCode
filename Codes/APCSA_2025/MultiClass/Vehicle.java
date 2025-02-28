package MultiClass;

// This is the parent class. It contains the foundamental for all kinds of vehicles
public class Vehicle {
    // Properties that all kinds of vehicles have and share
    private String make;
    private String model;
    private int year;
    private int numOfWheels;
    private double mileage;
    
    public Vehicle() {
        this.model = "Unknown";
    }

    public Vehicle(String make, String model, int year, int nW, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numOfWheels = nW;
        this.mileage = mileage;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String mo) {
        this.model = mo;
    }

    public void driveForward(int m) {
        System.out.println("I drived forward for " + m + " meters.");
    }
}