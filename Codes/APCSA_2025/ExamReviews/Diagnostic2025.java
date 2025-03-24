public class Diagnostic2025 {
    
    public static int findNumberOfRotations(String base, String rotation) {
        // when base and rotation are having different amounts, return -1
        if (base.length() != rotation.length()) {
            return -1;
        }

        // write a loop that repeats the number of times with base length
        for (int i = 0; i < base.length(); i++) {
            String sub1 = rotation.substring(0,i);
            String sub2 = rotation.substring(i);

            String check = sub2 + sub1;
            if (base.equals(check)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfRotations("Happy", "yHapp"));
    }
}
