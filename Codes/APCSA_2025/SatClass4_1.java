public class SatClass4_1 {
    
    /*
     * Method name: 
     * no special symbols
     * no numbers at start
     * no space
     * DON'T USE THE WORD main
     * 
     * After naming, add () at the end
     * Must have { }
     */
    public static void sayHello() {
        System.out.println("Hello");
    
    }

    public static int print10() {
        return 10;
    }

    public static double multiplyBy5(double a, double b) {
        return a * b * 5;
    }

    // everything in the bracket after method name are called arguments.
    public static void main(String[] args) {
        sayHello();

        // When the method has a return type, you want to call the method and put it into a variable
        // or, you can directly print in out
        int a = print10();
        System.out.println(print10());
        System.out.println(a);
        double d = multiplyBy5(4.0, 10.0);
        System.out.println(d);
    }
}
