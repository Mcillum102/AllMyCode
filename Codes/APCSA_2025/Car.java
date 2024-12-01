public class Car {

    // properties or fields
    // You don't have to add value at the proeprties section
    private String brand;
    private String color;
    private String model;
    private int year;
    private int oilLevel;

    // constructor
    /* You must have a constructor to create an object
        - constructor name matches the class name
        - It only needs public at the front
    */ 
    public Car(String theBrand, String theColor, String theModel, int theYear) {
        this.brand = theBrand;
        this.color = theColor;
        this.model = theModel;
        this.year = theYear;
    }

    // methods
    /* - For object methods, you don't need to add the word static */
    
    // getter example
    public String getBrand() {
        return this.brand;
    }

    // setter example
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    // getter example
    public int getOilLevel() {
        return this.oilLevel;
    }

    // setter example
    public void setOilLevel(int theOilLevel) {
        this.oilLevel = theOilLevel;
    }

    /*  Create a method that determines if I need to add oil for the car.
     *  If the oil level is below 20 (km), it will warn me to add oil.
     */
    public String needToAddOil() {
        if (this.getOilLevel() < 20) {
            return "Please add oil";
        }
        return "You can keep driving";
    }

    public static void main(String[] args) {

        // When you create an obj, you want to provide the correct amount of arguments in the bracket of contstructor.
        Car car1 = new Car("Mercedes", "Blue", "SUV", 2025); 

        // System.out.println(car1.getBrand());

        // car1.setBrand("BMW");
        // System.out.println(car1.getBrand());

        car1.setOilLevel(19);
        System.out.println(car1.needToAddOil());
    }
}
