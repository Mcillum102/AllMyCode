public class WedClass4_1 {

    public static void main(String[] args) {

        /* 1. Always create variables before you write a while loop, because you may need them for the conditons
        */
        int x = -5;
        while (x < 0) { // Whenever x is greater than 0, we will run the statements in the ()
            x++;
            System.out.println(x);
            //x--;        // x will minus one EVERYTIME before we enter the next iteration (a run of the loop)
        }
    }
}
