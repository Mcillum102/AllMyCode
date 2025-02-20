package WED;

public class Wed_2DArray {
    
    public static void main(String[] args) {
        int[][] twoDArray = new int[4][3];

        // The length of 2d Array is the number of rows.
        System.out.println(twoDArray.length);

        // The length of each row (row 0) of the 2d Array is the number of columns.
        System.out.println(twoDArray[0].length);

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}