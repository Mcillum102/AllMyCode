public class Sat_PE {

    /*
     * Return the length of the sequence.
     * It take 1 paramete, which is the starting number n.
     */
    public static int hailstoneLength(int n) {
        int counter = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                counter++;
            } else {
                n = 3 * n + 1;
                counter++;
            }
        }
        return counter;
    }

    /*
     * Return true if length of sequence is greater than the starting 
     * number n.
     */
    public static boolean isLongSeq(int n) {
        if (n < hailstoneLength(n)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hailstoneLength(8));

        System.out.println(isLongSeq(8));
    }
}