// Q4	9/9
public class ArrayResizer {

	// question a) 3/3
public static Boolean isNonZeroRow(int[][] array2D, int r)
{
	for(int x : array2D[r])
		if( x == 0)
	return false;
else
	return true;

	// check your spelling
}

	// question b)	6/6
public static int[][] resize(int [][] array2D)
{
	int numRows = numNonZeroRows(Array2D);
	int numCols = array2D[0].length;
	int[][] smaller = new int[numRows][numCols];
		int i = 0;
		for int r = 0; r < array2D.length; r++;)
		{
			if(isNumZeroRows(array2D, r))
		{
			for(int c = 0; c < numCols; c++;)
				smaller[i][c] = array2D[r][c];
		i++
	}
}
return smaller;
// check your spelling
}
}
