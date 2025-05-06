// Q4 	6/9
// Q4.a 	3/3
public static boolean isNonZeroRow(int[][] array2D, int r) {
	for (int i = 0; i < array2D[0].length; i++) {
		if (array2D[r][i] == 0) {
			return false;
		}
	}
	return true;
}

// Q4.b 	3/6
public static int[][] resize(int [][] array2D){
	// +1 correct declare for new 2d array
	// +1 correctly calls numNonZeroRows and isNonZeroRow
	// +1 find out the rows with no zeros
	int [][] smaller = new int[numNonZeroRows(array2D)][array2D[0].length];
	for (int i = 0; i < array2D.length; i++){
		if (isNonZeroRow(array2D), i){
			smaller[i] = array2D[i];
		}
	}
	return smaller;
}