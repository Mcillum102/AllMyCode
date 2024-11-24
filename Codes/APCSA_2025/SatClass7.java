public class SatClass7 {

    public static boolean mixStart(String str) {
        // create a substring that contain's the terms that we want to compare

        // the size should be over 3; the term between index1 and 3 should be equal to ix

        // if you are not too confident about the condition, don't do the following.
        return str.length() >= 3 && str.substring(1,3).equals("ix");
    }

    public static boolean sameStarChar(String str) {
        // keep locating the * character in my str

        // I want to use charAt() method since it takes 1 char and compares it with 1 char
        // Therefore, my loop should allow me to use numbers as Index.
        for (int i = 1; i < str.length() - 1; i++) { 
            // you cannot use .equals() for comparing string and char values
            if (str.charAt(i) == '*' && str.charAt(i - 1) == str.charAt(i + 1)) { 
                return true; 
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // String s = "Hello";

        // String s2 = s.substring(2, 4);
        // // endIndex is not included in the substring
        // // end index should always be larger than or equal to begin index
        // String sent = "This is a substring practice";
        // System.out.println(s2);
        // System.out.println(sent.substring(10, 19));
        
        // // charAt: return the character value at the given index inside a string
        // System.out.println(sent.charAt(23));
        // System.out.println(sent.charAt(sent.length()-1));

        // String s3 = "Butterfly";
        // System.out.println(s3.compareTo("Br"));
        // // the term calling method minus - the term in the brakcet. They both have to be " " Strings.
        // // compareTo compares each digit. If the digit is missing for one String, it stops.

        // System.out.println(mixStart("mix snacks"));
        // System.out.println(mixStart("pix snacks"));
        // System.out.println(mixStart("miz snacks"));
        // System.out.println(mixStart("ix"));

        // primitive type: adding values up by the rules
        // System.out.println(100 + 99);

        // reference type: adding new values at the back of the current value
        // System.out.println("100" + 99 + 98);
        // System.out.println(99 + 98 + "100");


        String s1 = new String("Hello");
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = "Hello";

        System.out.println(s1 == s3);
        System.out.println(s2 == s4);
    }
}
