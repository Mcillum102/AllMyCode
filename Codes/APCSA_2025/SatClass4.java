public class SatClass4 {
    
    public static void main(String[] args) {
        
        /* While loop will need a condition in the bracket
         * When the condition is T, the loop continues;
         * when the condition is F, the loop stops.
         * 
         * When you write a loop, you must consider update/change the value of variable, to meet the False condtion (stops loop)
         */
        int x = 1;      // We recommand create a variable, and to use it as a part of the condition
    
        while (x < 11) {
            
            System.out.print(x + " ");     // Whenever x is greater than 0, we print this line
                                               // minus 1 from x
            x++;
        }
        System.out.println("Loop Stop");
    }
}
