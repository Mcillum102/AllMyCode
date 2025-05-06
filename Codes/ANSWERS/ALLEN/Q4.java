// Q4   5/9
public class Q4 {
    // Q4.a 3/3
    public static Boolean isNonZeroRow(int[][] array2D, int r) {
        for (int i = 0; i < array2D[0].length; i++) {
            if (array2D[r][i] == 0) {
                return false;
            }

        }

        return true;

    }

    // Q4.b 2/6
    public static int[][] resize(int[][] array2D) {
        int count = 0;

        for (int i = 0; i < array2D.length; i++) {
            if (!isNonZeroRow(array2D, i)) {
                count++;
            }
        }
        // -1 didn't call numNonZeroRows method

        int[][] resized = new int[array2D.length - count][array2D[0].length];
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                for (int j = 0; j < array2D[0].length; j++) {
                    resized[i][j] = array2D[i][j];
                }
            }
        }
        return resized;
    }
}