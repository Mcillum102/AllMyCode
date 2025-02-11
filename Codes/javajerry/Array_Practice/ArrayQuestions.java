package javajerry.Array_Practice;

import java.util.*;

public class ArrayQuestions {

    public int countBetween(double[] values, double lower, double upper){
        int count = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i] >= upper || values[i] <= lower){
                count++;
            }
        }
        return count;
    }

    public boolean[] overpriced(double[] rsiValues){
        boolean[] overpricedArray = new boolean[rsiValues.length];
        for (int i = 0; i < rsiValues.length; i++){
            if (rsiValues[i] > 70) {
                overpricedArray[i] = true;
            } else {
                overpricedArray[i] = false;
            }
        }
        return overpricedArray;
    }

    public static int[] onlyEvens(int arraySize, int range){
        int[] onlyEvensArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            onlyEvensArray[i] = (int)(Math.random() * (range/2+1) + 10) * 2;
        }
        return onlyEvensArray;
    }

    public boolean isIncreasing(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size()-1; i++){
            if (arr.get(i+1)<=arr.get(i)){
                return false;
            }
        }
        return true;
    }
    


    public static void main(String[] args) {
        
        int[] answer = onlyEvens(10, 100);
        for (int i : answer) {
            System.out.println(i);
        }

    }
}
