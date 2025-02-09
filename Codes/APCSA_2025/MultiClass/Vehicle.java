package MultiClass;

// This is the parent class. It contains the foundamental for all kinds of vehicles
public class Vehicle {
    // Properties that all kinds of vehicles have and share
    public String make;
    public String model;
    public int year;
    public int numOfWheels;
    public double mileage;
    
    public Vehicle() {

    }

    public Vehicle(String make, String model, int year, int nW, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numOfWheels = nW;
        this.mileage = mileage;
    }

    public void driveForward(int m) {
        System.out.println("I drived forward for " + m + " meters.");
    }
}
