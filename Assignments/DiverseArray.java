public class DiverseArray {
    
    // Sum up the array
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            // sum += arr[i];
        }
        return sum;
    }

    // Calculate the sum of each row and store them into an 1d array.
    public static int[] rowSums(int[][] arr2D) {
        int[] rowSum = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            // If I call arr2D[i], it should represent each row in arr2D. Each row is another array.
            // My goal in this forloop is to sum each row up, how to do it?
            // I will store this value into rowSum
            rowSum[i] = arraySum(arr2D[i]);
        }
        return rowSum;
    }

    // this method determines if the row sum for each row in the 2d array are all different.
    // If any of the row sum equals, return false. Otherwise, return true.
    public static boolean isDiverse(int[][] arr2D) {
        // Use a nested-for loop structure to compare things inside an array.
        int[] rowSum = rowSums(arr2D);
        for (int i = 0; i < rowSum.length - 1; i++) {
            for (int j = i + 1; j < rowSum.length; j++) {
                if (rowSum[i] == rowSum[j]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,7,2,3};
        int[][] arr2D = {{1,2,3,4,5},{6,7,8,9,10}};

        int[] arr2 = new int[5];

        System.out.println(arraySum(arr));
    }
}
