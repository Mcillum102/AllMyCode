public class Wed_2DArray {
    
    public static void main(String[] args) {
        int[][] twoDArray = new int[4][3];

        // The length of 2d Array is the number of rows.
        System.out.println(twoDArray.length);

        // The length of each row (row 0) of the 2d Array is the number of columns.
        System.out.println(twoDArray[0].length);

        String[][] twoDArray2 = {{ "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" }, { "j", "k", "l" }};

        // Nested for loop is used a lot with 2d Array.
        for (int i = 0; i < twoDArray2.length; i++) {
            for (int j = 0; j < twoDArray2[i].length; j++) {
                System.out.print(twoDArray2[i][j] + " ");
            }
            System.out.println();
        }
    }
}