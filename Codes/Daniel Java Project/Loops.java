public class Loops {
    public static void main(String[] args) {
        /*
         * 1. var1 = 3, var2 = 2
         * (2 != 0) and (3/2 >= 0)
         * T T
         * 
         * 
         * 
         */
        // for (int i = 1; i < 6; i++) {
        // System.out.println("hi");
        // System.out.println(12909);
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }
        int var1 = 0;
        int var2 = 2;
        while ((var2 != 0) && ((var1 / var2) >= 0)) {
            var1 = var1 + 1;
            var2 = var2 - 1;
        }
        System.out.println(var1);
        System.out.println(var2);
    }
}
