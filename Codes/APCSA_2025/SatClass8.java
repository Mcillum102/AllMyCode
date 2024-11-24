public class SatClass8 {

    /*  Given a string of any length, return a new string where the last 2 chars, 
            if present, are swapped, so "coding" yields "codign". 
         * 
         *  lastTwo("coding") → "codign"
         *           012345
            lastTwo("cat") → "cta"
            lastTwo("ab") → "ba"
    */

    public static String lastTwo(String str) {
        // finding the length of the str
        int length = str.length();

        // condition to prevent red error
        if (length < 2)     return str;

        // fristPart will be everything in front of the final two terms
        String firstPart = str.substring(0, length - 2);
        // char1 will be the 2nd last character
        String char1 = str.substring(length - 2, length - 1);
        // char2 will be the last character
        String char2 = str.substring(length - 1);

        return firstPart + char2 + char1;
    }

    /*  Given a string, if the first or last chars are 'x', 
        return the string without those 'x' chars, and otherwise return the string unchanged.

        withoutX("xHix") → "Hi"
        withoutX("xHi") → "Hi"
        withoutX("Hxix") → "Hxi"
    */
    public static String withoutX(String str) {
        // avoid error for empty strings
        if (str.length() < 1)   return str;

        // avoid error for str equals to "x"
        if (str.equals("x")) return " ";
    
        String firstChar = str.substring(0, 1);
        String lastChar = str.substring(str.length() - 1);

        if (firstChar.equals("x") && lastChar.equals("x")) {
            // return out the middle part that x doesn't exist
            return str.substring(1, str.length() - 1);
        } else if (firstChar.equals("x")) {
            return str.substring(1);
        } else if (lastChar.equals("x")) {
            return str.substring(0, str.length() - 1);
        }

        return str;

    }

    public static void main(String[] args) {
        // String s = "Hellootow";
        //             012345678

        // Your indexes falls in the range from 0 ~ .length() - 1
        // System.out.println("length: " +s.length());
        // System.out.println("last index: " + s.indexOf("w"));

        // the characters at endIndex is not included in the substring
        // String sub1 = s.substring(0, 1);
        // System.out.println("With endindex: " + sub1);

        // Try to use .substring() instead of .charAt() for questions.
        // String sub2 = s.substring(6);
        // System.out.println("Without endindex: " + sub2);

        // .equals() compares the values of the variables
        // String s1 = "hellootow";
        // System.out.println(s.equals(s1));
        //                  s == s1

        // if you use .compareTo() with the same string values, it will return 0
        // System.out.println(s.compareTo(s1));
        // System.out.println(5 + 3 + "13" + 5 + 10);
        
        // System.out.println(lastTwo(""));
        // System.out.println(withoutX("xHix"));
        // System.out.println(withoutX("xHi"));
        // System.out.println(withoutX("Hix"));
        // System.out.println(withoutX("Hxi"));
        // System.out.println(withoutX("h"));
        // System.out.println(withoutX("x"));

        // toString()
        int x = 789;
        double d = 92.6;
        String xString = Integer.toString(x);
        String dString = Double.toString(d);

        System.out.println("Not same type: " + (x + xString));
        System.out.println("Same type: " + (x + x));
        System.out.println(dString);

        // valueOf()
        String strInt = "5278";
        String strDouble = "829.67";

        int i = Integer.valueOf(strInt);
        double d1 = Double.valueOf(strDouble);
        System.out.println(i / 10);
        System.out.println(d1 / 10);
        

        /*  You are given a integer that is > 100. You goal is to write something so
         *  we can know what's the sum of all digits for the integer.
         * 
         *  For example, your integer is 1702, the sum of all digits is 10.
         * 
         *  In another word, if a string "1702" is given to you, how do you calculate the sum of all digits.
         *  answer = 1 + 7 + 0 + 2
         *  
         *  int number = 1702;
         *  
         *  After that, if I set number to 62542, it should still do the job without errors, and the answer will be 19.
         *  answer = 6 + 2 + 5 + 4 + 2
         */
        
    }
}