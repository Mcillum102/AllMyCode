package MultiClass;

public class Car extends Vehicle {
    public String driveMode;
    
    public Car() {
        
    }

    public void driveForward(int m) {
        System.out.println("I'm on a car.");
        System.out.println("I drived forward for " + m + " meters.");
    }
}
