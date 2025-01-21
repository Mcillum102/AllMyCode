package SAT;

public class Sat_Array {

    // String[] a = {"four", "score", "and", "seven", "years", "ago"};

    // public static void swapPairs(String[] a) {

    // String temp = a[1];
    // a[1] = a[0];
    // a[0] = temp;

    // System.out.println(a[0]);
    // System.out.println(a[1]);
    // }

    public static void main(String[] args) {

        /*
         * Start from indicating the type of the array
         * Add [] behind
         * Give a variable name
         * =
         * The word new for new object
         * Special constructor that uses the type name with []
         * In the [], we MUST declare how many items will be store in the array
         */
        int[] intArray = new int[4];

        // Create a String array using the same way above
        String[] strArray = new String[10];
        // System.out.println(intArray);
        // System.out.println(strArray);

        intArray[0] = 90;
        intArray[1] = 80;
        intArray[2] = 70;
        intArray[3] = 60;

        // This code shows us how to print the value at index 2.
        // Write something that can print all values in the array, no matter how long the array is.
        // hints: repeat a step with some number of times.

        // The length of array can be shown by using: intArray.length  (without ())
        // length in Array class is not a method, so no ()
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }



        // System.out.println(strArray);




        // strArray[0] = "Red";
        // strArray[1] = "Blue";
        // strArray[2] = "Green";

        // System.out.println(intArray[1]);

        // System.out.println(strArray[0]);
        // System.out.println(strArray[1]);
        // System.out.println(strArray[2]);

        // int arrayNumber = 0;
        // while (arrayNumber < strArray.length) {
        // System.out.println(strArray[arrayNumber]);
        // arrayNumber++;
        // }

        // for (int i = 0; i < strArray.length; i++) {
        // System.out.println(strArray[i]);
        // }

        // int[] intArray2 = {18, 20, 22, 24};
        // String[] strArray2 = {"a", "b", "c"};

        // String[] a = {"four", "score", "and", "seven", "years", "ago"};
        // swapPairs(a);
    }
}
