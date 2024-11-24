public class WedClass7 {

    // public static boolean sameStarChar(String str) {
    //     // str = "xax*xyza"

    //     // how to write something that can find *
    //     // I'm write a loop to make sure I can move my search index each time
    //     int index = 0;
    //     while (index < str.length()) {
    //         // make sure the index i get is between 1 - last index -1, 
    //         // this can make sure that there are before and after items around that index
    //         if (str.indexOf("*", index) != 0 && str.indexOf("*", index) != str.indexOf(str.length() - 1)) {
    //             int currentIndex = str.indexOf("*", index);
    //             return str.charAt(currentIndex - 1) == str.charAt(currentIndex + 1);
    //         }
    //         index++;
    //     }
    //     return false;
    // }

    // the questions asks us to see if the string starts with "mix", where the 'm' can be replaced by any characters
    public static boolean mixStart(String str) {
        return str.indexOf("i") == 1 && str.indexOf("x") == 2;
    }


    public static void main(String[] args) {
        


        // Create a string object s
       

        // For all objects, they are able to use the methods in their classes (Type)
        // Now, we can use s. to call and use string methods

        // int len = s.length();
        // int aIndex = s.indexOf("a");
        
        // System.out.println(len);
        // System.out.println(aIndex);

        // System.out.println(sameStarChar("xax*xyza"));       // true
        // System.out.println(sameStarChar("xaa*xyza"));       // false
        // System.out.println(sameStarChar("*xaa*xyza"));      // false
        // System.out.println(sameStarChar("*xax*xyza"));      // true
        // System.out.println(sameStarChar("xax*"));      // true

        /* charAt will provide you the value at specific index.
            - if you provide a index that doesn't exist, there is an error
        */
        // String s = "This is a test";
        // char c = s.charAt(5);

        /* Substring: returns a section of the string with given begin and end (not included) index 
         * - endindex is not included
         * - if you only provide the begin index, you will get a string starts from begin, ends at the orginal end
        */

        // String s2 = s.substring(5,7);
        //           is
        // String s3 = "si";
        // System.out.println(s2.equals(""));
        // System.out.println(s2.compareTo(s3));
        // System.out.println(s3.compareTo(s2));
        // ASCII: according to thie encode table, a is the smallest lower case letter

        // String s1 = "Hi";
        // String s2 = s1.substring(0,1);
        // String s3 = s2;

        String s1 = new String("hi there");
        int pos = s1.indexOf("e");
        String s2 = s1.substring(0,pos);

        // s1 = s1 + (134+9);
        s1 = 1 + s1;
        // s1 = s1 + 102.9;

        System.out.println("hisllo");

    }
}
