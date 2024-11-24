public class SatClass6 {

    // public static boolean factorChecker(int num1,int num2){ 
    //     if (num2 % num1 == 0) {
    //         return true;    
    //     }
    //     System.out.println();
    //     return num2%num1==0;

    // }


    // /10 and %10 are very useful for lots of questions. You will want to remember the use of them.
    // public static int countDigits(int number) { 
    //     int count = 0; 
    //     for (int i = number; i > 0; i /= 10) { 
    //         count++; 
    //     } 
    //     return count; 
    // } 

    
    public static void main(String[] args) {
        // int var1 = 8; 
        // int var2 = 2;
        
        // // var2 = 0, F          2/0
        // while ((var2 != 0) || ((var1 / var2) >= 0)) { 

        //     var1 = var1 + 1; 

        //     var2 = var2 - 1; 

        // }

        // System.out.println(var1);
        // System.out.println(var2);
        // boolean x=factorChecker(5,125); 
        // System.out.print(x);
        // countDigits(12345);
        
        // Math.max(0, 0); 

        // This is an example of calling a method using object
    
        // int x = 10;
        // x.length(); primitive type variables doesn't call any methods

        // When we use the 'new' keyword, we are creating a new object

        // The string objects that you created using the same way, containing same value, are == to each other.
        // String s1 = new String("test new word"); 
        // String s3 = new String("test new word"); 

        // String s = "test new word";
        // String s2 = "test new word";

        // s.length();

        // System.out.println(s == s2);
        
        /* One of differences between primitive type and object type is that, primitive cannot call any method. */


        String sent = "This is a testa";
        String sent2 = "This is a testb";
        // System.out.println(sent.length());

        /* looking for the 1st appearance of the given argument
         *  when you have mulitple similar items in the string, it's not going to consider other ones
        */ 
        // System.out.println(sent.indexOf("is8"));
        
        // System.out.println(sent.equals(sent2));

        System.out.println(sent.compareTo(sent2));

        
    }
    
}