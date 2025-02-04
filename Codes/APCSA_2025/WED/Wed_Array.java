package WED;

public class Wed_Array {

    // String[] a = {"four", "score", "and", "seven", "years", "ago"};

    public static void swapPairs(String[] a) {

        for (int i = 0; i < a.length; i += 2) {
            String temp = a[i+1];
            a[i+1] = a[i];
            a[i] = temp;
        }

        System.out.print(a[0] + " ");
        System.out.print(a[1] + " ");
        System.out.print(a[2] + " ");
        System.out.print(a[3] + " ");
        System.out.print(a[4] + " ");
        System.out.print(a[5] + " ");
        
    }

    public static void main(String[] args) {

        // We've created an int array named x.
        // We must provide the size of the array.
        int[] intArray = new int[6];
        String[] strArray = new String[10];
        System.out.println(intArray);
        System.out.println(strArray);

        // intArray[0] = 90;
        // intArray[1] = 80;
        // intArray[2] = 70;
        // intArray[3] = 60;
        // intArray[4] = 50;
        // intArray[5] = 40;

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

        String[] a = { "four", "score", "and", "seven", "years", "ago" };
        swapPairs(a);
    }
}
