public class TestReview {

    private static String word;
    
    public static void changer(String x, int y) {
        x = x + "peace";
        y = y * 2;
        System.out.println(x);
        System.out.println(y);
        word = "2";
    }

    public static void test() {
        String s = "world";
        int n = 6;
        changer(s, n);
        /* End of method */
        System.out.println(s);
        System.out.println(n);
        word = " 8";
    }

    public static void main(String[] args) {
        test();
    }
}