public class Sat_Overload {
    
    private String name;

    // If there's no constructor, this will be the only constructor
    public Sat_Overload() {
    }

    // if other constructor present, then the one that takes no parameter will be
    // ignored
    public Sat_Overload(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hi";
    }

    public String greet(String who) {
        return "Hello " + who;
    }

    public String greet(int number) {
        return "Hello " + number;
    }
    /*
     * In your class create some overload methods with rules:
     * These methods are used to display a jump action:
     * 1. jump method takes no parameter, returns the sentence: I jumped.
     * 
     * 2. jump method takes 1 parameter (a string object that describes something),
     * returns the sentence: I jumped over the ___.
     * 
     * 3. jump method takes 2 parameters (a string object that describes something;
     * an int value that describes how high i jumped),
     * returns the sentence: I jumped over the ___ for ___ meters.
     * 
     * Start from this method:
     * 1. jump method takes no parameter, returns the sentence: I jumped.
     * public String jump() {
     * // some code //
     * }
     *
    */

    public String jump() {
        return "I jumped.";
    }

    public String jump(String thing) {
        return "I jumped over the " + thing + ".";
    }

    public String jump(String thing, int height) {
        return "I jumped over the " + thing + " for " + height + " meters.";
    }
    

    public static void main(String[] args) {
        Sat_Overload obj1 = new Sat_Overload();

        System.out.println(obj1.jump());
        System.out.println(obj1.jump("car"));
        System.out.println(obj1.jump("car", 3));

        // // Create an object obj2 that has the name "Martin"
        // Sat_Overload obj2 = new Sat_Overload("Martin");
        // System.out.println(obj2.greet(42));

        // System.out.println(obj1.doSomething(obj2));
    }

}
