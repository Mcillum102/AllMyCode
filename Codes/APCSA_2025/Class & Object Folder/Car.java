public class Car {

    /* Fields / Properties 
     * This part is storing the info / data of the class (car) as variables.
     * It's not mandatory to provide a value at here.
     * Structure: private Type var_name;
     */
    private String brand;
    private String engine;
    private int size;
    private int tireSize;
    private String color;

    /* Constructor
     * It has the same name as the Class name
     * Constructor has no return type nor void.
     * Structure: public class_name() {}
     * 
     * Argument Rules:
     * Usually, your arguments should match your properties with the same type.
     */
    public Car(String theBrand, String theEngine, int theSize, int theTireSize, String theColor) {
        // After writing down the correct arguements, we will assign them into properties (variables)

        // The word this stand for the object itself.
        // It also represesnts the object that called the constructor / methods
        this.brand = theBrand;
        this.engine = theEngine;
        this.size = theSize;
        this.tireSize = theTireSize;
        this.color = theColor;
    }

    /* Methods
     * Methods in a class are usually non-static, which means they are object-related
     * The word static means: class related. Anything that's static can be directly called by a Class name
     * Non-static means: this thing should be called by the object.
     */

    // Getter: return the value of specific property out
    // The return type should be the same as the property you want to return
    public int getSize() {
        return this.size;
    }

    // Setter: change or set value for your property
    // Setters are also VOID type; including argument
    // The argument type needs to be the same as your property's type
    public void setSize(int newSize) {
        this.size = newSize;
    }
    
    /* Complete the following method and meet all requriements
     * In this method, we want to check if the tire size of your car is larger than 19.
     * If it is, it says: "The tires are good for many situations"
     * If not, it says: "The tires are not big enough for some cases"
     */
    public String checkTireSize() {
        if (getSize() > 19) {
            return "The tires are good for many situations";
        }
        return "The tires are not big enough for some cases";
    }


    public static void main(String[] args) {
        // how to create a Car (Type) object
        // Don't name your variables same as any of the properties

        // Structure to create any object:
        // Type var_name = new Constructor();
        Car car1 = new Car("Ford", "Battery Engine", 4, 1, "Rainbow"); 

        // Output the properties
        System.out.println(car1.brand);
        System.out.println(car1.color);

        // Use methods
        car1.setSize(22);
        System.out.println(car1.getSize());
        System.out.println(car1.checkTireSize());
    }
}