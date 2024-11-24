import java.util.Scanner;

public class WedClass4 {

    /* Method name rules: 
     * 1. don't start with numbers
     * 2. don't put any space or speical characters (besides _)
     * 3. Recommand to use lower case as start
    */
    
    // public static void printHi() {
    //     System.out.println("Hihuhuhuhuhuh");
    // }

    // public static int addTwoNumbers(int x, int y) {
    //     System.out.println(x + y);
    //     return x + y;
    // }

    public static void main(String[] args) {
        // int x = 1;
        // if (x<0) {

        // } else if (x==1) {

        // }
        // printHi();

        /* In order to show the result of any non-void method (If your method don't have print):
         * 1. create a correspounding variable to store the value
         * 2. add sysout statement in main method or the method itself
         */
        // int sum = addTwoNumbers(4,10);
        // System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("My name is " + name);
        
        sc.close();
        SatClass4_1.sayHello();
    }
}
