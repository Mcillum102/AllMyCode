public class Exam2015 {

    public static int arraySum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] row = new int[arr2D[0].length];
        int[] answerArr = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            row = arr2D[i];
            answerArr[i] = arraySum(row);
        }

        return answerArr;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);
        for (int i = 0; i < sums.length - 1; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[i] == sums[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] output = { 1, 2, 3, 4, 5 };
        int[][] out2d = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 5, 2, 3, 4, 1 } };

        System.out.println(arraySum(output));
        System.out.println(rowSums(out2d)[0]);
        System.out.println(rowSums(out2d)[1]);
        System.out.println(isDiverse(out2d));
    }
}