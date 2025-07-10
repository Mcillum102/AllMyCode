public class CarA {

    // Properties / Fields
    // These information are usually the identities of something
    // We usually use private properties
    private double speed;
    private int yearBuilt;
    private String color; 
    private double distances;
    
    // Constructor
    // The methods that creates Objects
    // Contructor will always be public
    // public Car() {}     // deafult constructor
    public CarA(double theSpeed, int theYearBuilt, String theColor) {
        speed = theSpeed;
        yearBuilt = theYearBuilt;
        color = theColor;
        distances = 0;
        // Assigning parameters into local properties
        // parameter are variables that accepts values from other places that calls the method
    }

    // Method
    // Some actions that your objects can do; information that you want to share with other classes

    // This method will record how long I've driven my car
    // Since we are just recording, this can be a void method
    public void recordDistance(double driven) {
        // there is a keyword: this, in java. It indicates the object that is currently calling the method
        this.distances += driven;    // Each time when I call recordDistance, it will add it into my total distances
        System.out.println(distances);
    }

    // I want to create a method that can return the car's speed as a value
    

    // How to create a method?
    /*  1. public, for most cases
        2. (optional) static; static means your method is related to class directly. non-static means it's realting to objects
        3. return type or void (means no return)
        4. method name with ()
        5. parameters or not
        6. don't forget {}
    */
    public static int calculateAplusB(int a, int b) {
        return a + b;
    }
    public static void sayHi() {
        System.out.println();
    }
    
    public static void main(String[] args) {

        CarA c = new CarA(110.5, 2021, "white");      // This will create a car object that's stored in variable c
        CarA c1 = new CarA(80, 1991, "red");      // This will create a car object that's stored in variable c
        // The first Car is the type of the variable
        // The second Car() is a constructor
        c.recordDistance(300);
        c.recordDistance(40);
    }
}