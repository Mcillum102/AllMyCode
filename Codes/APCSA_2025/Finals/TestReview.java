package Finals;
public class TestReview {

    public static void changer(String x, int y) {
        x = x + "peace";
        y = y * 2;
    }

    public static void test() {
        String s = "world";
        int n = 6;
        changer(s, n);
        System.out.println(s);
        System.out.println(n);
    }

    // public static void pword(String w1, String w2) {
    // String s1 = w1.substring(0,2);
    // String s2 = w2.substring(w2.length() - 1);
    // String result = s2 + s1;
    // System.out.println(result.indexOf(s2));
    // }

    public static void main(String[] args) {
        // double answer = 13 / (double) 5;
        // System.out.println(answer);
        // pword("Yi", "We");
        test();

        System.out.println(283415 % 10);
    }
}