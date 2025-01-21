public class TestReview {

    // private static String word;

    // public static void changer(String x, int y) {
    // x = x + "peace";
    // y = y * 2;
    // System.out.println(x);
    // System.out.println(y);
    // word = "2";
    // }

    // public static void test() {
    // String s = "world";
    // int n = 6;
    // changer(s, n);
    // /* End of method */
    // System.out.println(s);
    // System.out.println(n);
    // word = " 8";
    // }

    public void processWords(String word1, String word2){ 

        String str1 = word1.substring(0,2); 

        String str2 = word2.substring(word2.length() -1); 

        String result = str2 + str1; 

        System.out.println(result.indexOf(str2)); 

    } 

    public static void main(String[] args) {
        // test();
    
    }
}