package SAT;

import java.util.List;
import java.util.ArrayList;

public class Sat_ArrayQuestions {

    public int countBetween(double[] values, double lower, double upper) {
        int counter = 0;
        for (double value : values) {
            if (value <= lower || value >= upper) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isIncreasing(ArrayList<Double> stockPrices) {
        for (int i = 2; i < stockPrices.size() - 1; i++) {
            double difference = stockPrices.get(i) - stockPrices.get(i - 1);
            double firstIncrease = stockPrices.get(i - 1) - stockPrices.get(i - 2);
            if (difference < firstIncrease) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // // How to create an int array with 5 items?
        // // The values in intArray are 0 when we create them.
        // int[] intArray = new int[5];

        // // How to write the for:each loop
        // // (variable with the array type : array)
        // for (int i : intArray) {
        // // i or any variable in this case, represent each items in the array
        // System.out.println(i);
        // }
        // System.out.println("break");
        // for (int j = 0; j < intArray.length; j++) {
        // // j or any variable in the form, represent the indexes
        // System.out.println(j);
        // }

        // // How to create a String ArrayList?
        // ArrayList<String> strAL = new ArrayList<String>();

        // strAL.add("A");
        // strAL.add("A");
        // strAL.add("A");
        // strAL.add("A");
        // strAL.add("A");
        // for (String s : strAL) {
        // System.out.println(s);
        // }

        Sat_ArrayQuestions obj1 = new Sat_ArrayQuestions();

        double[] dArr = { 634.5, 521.8, 786.6, 899.0, 509.1, 235.4, 750.0,
                806.8, 142.5, 645.3 };

        System.out.println(obj1.countBetween(dArr, 250.0, 750.0));

    }
}
