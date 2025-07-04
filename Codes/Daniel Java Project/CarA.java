public class CarA {

    // Properties / Fields
    // These information are usually the identities of something
    // We usually use private properties
    private double speed;
    private int yearBuilt;
    private String color; 
    
    // Constructor
    // The methods that creates Objects
    // Contructor will always be public
    // public Car() {}     // deafult constructor
    public CarA(double theSpeed, int theYearBuilt, String theColor) {
        speed = theSpeed;
        yearBuilt = theYearBuilt;
        color = theColor;
        // Assigning parameters into local properties
        // parameter are variables that accepts values from other places that calls the method
    }
    
    public static void main(String[] args) {

        CarA c = new CarA(110.5, 2021, "white");      // This will create a car object that's stored in variable c
        // The first Car is the type of the variable
        // The second Car() is a constructor
        System.out.println(c.speed);
    }
}