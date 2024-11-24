public class WedClass5 {
    
    // /* We are creating a method that squares numbers (multiply a number by itself) */
    // public static int squareNumbers(int number) {
    //     int answer = number * number;
    //     return answer;
    //     // return number * number;
    // }

    // public static void printNumbers(int a, int b){
    //     int min = Math.min(a, b);
    //     int max = Math.max(a, b);

    //     while (min <= max) {
    //         System.out.print(min + " ");
    //         min++;
    //     }
    // }

    public static String breakDemo(){
        for(int i=0; i <5; i++){
            System.out.println(i);
            if(i==3){
                break;
            }
        }
        System.out.println("end.");
        return "empty";             // return will stop the whole method
    }
    
    public static void printPopSong(){
        String line1 = " bottles of pop on the wall";
        String line2 = " bottles of pop";
        String line3 = "Take one down and pass it around";
        // loop 5 times (5, 4, 3, 2, 1)
        for (int i = 5; i > 0; i--){
           System.out.println(i + line1);
           System.out.println(i + line2);
           System.out.println(line3);
           System.out.println((i - 1) + line1);
           System.out.println();
        }
     }
   

    public static void main(String[] args) {

        // int x = squareNumbers(8);
    
        // System.out.println(squareNumbers(10));

        // printNumbers(2, 7);
        // System.out.println();
        // printNumbers(7, 2);
        // System.out.println();
        // printNumbers(2,2);

        /*  For loop 
         * 
         * The following loop starts from 0, ends at 10, include 10. Each time of the loop, i will add 1 to itself
        */

        // for (int i = 0; i <= 10; i++) {
        //     System.out.print(i + " ");

        //     if (i == 7) {
        //         break;              // stops the loop at a specific condition or point
        //     }
        // }

        // System.out.println();

        // int x = 0;
        // while (x <= 10) {
        //     x++;
        //     System.out.print(x + " ");
        // }

        // for (int row = 0; row < 4; row++){//outer
        //     for (int col = 0; col < row; col++){//inner
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = 3; i <= 9; i += 1){
        //     for (int j = 6; j > 0; j -= 1){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        int x = 0;
        int y = 3;
        if (x > 0 && y / x == 3) System.out.println("first case");
        else System.out.println("second case");
        
    }
}
