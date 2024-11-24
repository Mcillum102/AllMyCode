public class WedClass6 {

    public static void printHi() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {

        // new must be present for object declaration besides string
        // 
        // int x = 9;

        // WedClass6.printHi();

        // int len = str2.length();
        // System.out.println(len);

        // System.out.println("hiahcihaec");
        // System.out.println("12345");
        // System.out.println('1');

        // String str1 = "Hello";

        // String str2 = new String("Hello");

        // String s3 = "Hello";

        // str1 = "Computer";  // Changing the value that str1 is pointing to, doesn't change what s3 is pointing

        // System.out.println(str2 == str1); // str2 == str1; comparing objects
        // System.out.println(s3 == str1);   // s3 == str1; comparing object;
        // System.out.println(s3 == str2);   // s3 == str1; comparing object;

        String sentence = "This is a test test";

        System.out.println(sentence.length());
        System.out.println(sentence.indexOf("test", 13));
        // indexOf(str) will look for the str starting from index 0
        // indexOf(str, i) will look for the str starting from index i
    }

}
