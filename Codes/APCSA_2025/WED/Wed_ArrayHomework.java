

import java.util.ArrayList;

public class Wed_ArrayHomework {

    public int countBetween(double[] values, double lower, double upper) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] <= lower || values[i] >= upper) {
                count += 1;
            }
        }
        return count;
    }

    public boolean isIncreasing(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= arr.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        double[] dArr = { 634.5, 521.8, 786.6, 899.0, 509.1, 235.4, 750.0, 806.8, 142.5, 645.3 };

        ArrayList<Integer> intAL = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            intAL.add(i);
        }
        intAL.add(-2);


        // Wed_MultiClass obj1 = new Wed_MultiClass();
        // int count = obj1.countBetween(dArr, 250.0, 750.0);

        // System.out.println(obj1.isIncreasing(intAL));
        // System.out.println(count);
    }
}
