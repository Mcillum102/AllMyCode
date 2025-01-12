public class TestReview {

    public static void changer(String x, int y) {
        x = x + "peace";
        y = y * 2;
        System.out.println(x);
        System.out.println(y);
    }

    public static void test() {
        String s = "world";
        int n = 6;
        changer(s, n);
        /* End of method */
        System.out.println(s);
        System.out.println(n);
    }

    public static void main(String[] args) {
        test();
    }
}