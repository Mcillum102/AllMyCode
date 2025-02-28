package MultiClass;

public class Car extends Vehicle {
    private String driveMode;

    // In the default constructor for Car, super() is already called but not shown
    // super() will try to call the default constructor in Vehicle (parent class)
    // If no default in parent, car needs to call super with one of the constructors in parent.
    // We can use a default constructor in child only if there is a default constructor in parent.
    public Car() {
        super();
        this.driveMode = "";
    }

    // The constructors in subclasses will usually have the parameters that's from the parent class.
    public Car(String make, String model, int year, int nW, double mileage, String dM) {
        super(make, model, year, nW, mileage);
        this.driveMode = dM;
    }

    public void driveForward(int m) {
        super.driveForward(m);
        System.out.println("I'm on a car.");
    }
}