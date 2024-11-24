public class SatClass5 {
    

    /*  Method Names:
     * When we are writing a method name, it first need to follow the same rules as variables
     * 
     * We want to create the method name relate to it's ability
     * I can write a method name similar to : squareNumbers
     */
    // public static int squareNumbers(int num1) {
    //     int answer = num1 * num1;

    //     return answer;

    //     // or just type:
    //     // return num1 * num1;
    // }

    // public static void printAllNumbers(int a,int b){ 
    //     int resultSmall = Math.min(a ,b); 
    //     int resultLarge = Math.max(a ,b); 
        
    //     while (resultSmall <= resultLarge) {
    //         System.out.print(resultSmall + " ");
    //         resultSmall++;
    //     }

    //     System.out.println();

    //     // for (int i=resultSmall; i<=resultMax; i++) { 
    //     //     System.out.print(i); 
    //     //     System.out.print(" "); 
    //     // } 
    // } 

    public static String breakDemo(){
        for(int i=0; i <5; i++){
            System.out.println(i);
            if(i==3){
                return "";
                //break;      // stops the loop when i == 3
            }
        }
        System.out.println("end.");
        return "";
    }
    
    
    public static void main(String[] args) { 
        // printAllNumbers(1,5); 

        /*
         * 1. initial
         * 2. condtion
         * 3. changes (increment means adding, decrement means minusing)
         */
        // for (int i = 0; i < 10; i++) {
        //     System.out.print("Number "); // don't change lines
        //     System.out.println(i);
        // }
        
        breakDemo();
  
    }

    // public static void main(String[] args) {
    //    int x = squareNumbers(4);
    //    System.out.println(x);

    //    // or
    //    // System.out.println(sqaureNumbers(4));

    
    // }
}
