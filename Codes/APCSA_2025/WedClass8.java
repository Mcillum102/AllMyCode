public class WedClass8 {
    public static void main(String[] args) {
        
        // String s = "Georgia Tech";
        // //          01234567

        // String s1 = s.substring(0,7);

        // String s2 = s1.substring(2);
                                                      
        // String s3 = s2.substring(0,3);

        // System.out.println(s3);

        // String s1 = "xyz";
        // String s3 = new String("xyz");
        // System.out.println("13" + (5 + 3));

        String s1 = "19203";
        int num = Integer.valueOf(s1);

        double d = 293.62;
        String dString = Double.toString(d);

        /*  You are given a integer that is > 100. You goal is to write something so
         *  we can know what's the sum of all digits for the integer.
         * 
         *  For example, your integer is 1702, the sum of all digits is 10.
         */
        // int number = 1702;

        
        //                                     i  i+1   
        //System.out.println(sNumber.substring(0,   1));
        //System.out.println(sNumber.substring(1,   2));
        //System.out.println(sNumber.substring(2,   3));
        
        // initialization
        int answer = 0;
        String example = "";

        String sNumber = "1702";

        for (int i = 0; i < sNumber.length(); i++) {
            String str1 = sNumber.substring(i, i+1);
            int number = Integer.valueOf(str1);
            answer = answer + number;
        }
        System.out.println(answer);
    }
}
