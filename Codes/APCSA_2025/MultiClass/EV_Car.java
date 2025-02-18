package MultiClass;

public class EV_Car extends Car {

    // Override the driveForward method that's in the parent class.
    // Add another line of output that says: Start charging
    
    public void driveForward(int m) {
        super.driveForward(m);
        System.out.println("Car starts to charge.");
    }
}
