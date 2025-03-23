public class Exam2014 {

    // private String[] scrambledWords;

    // public Exam2014(String[] sw) {
    // scrambledWords = mixedWords(sw);
    // }

    // public String recombine(String word1, String word2) {
    // String half1 = word1.substring(0, word1.length() / 2);
    // String half2 = word2.substring(word2.length() / 2);

    // return half1 + half2;
    // }

    // private String[] mixedWords(String[] words) {
    // String[] mixed = new String[words.length];
    // for (int i = 0; i < words.length; i += 2) {
    // mixed[i] = recombine(words[i], words[i+1]);
    // mixed[i+1] = recombine(words[i+1], words[i]);
    // }

    // return mixed;
    // }
    public static boolean isIncreasing(int[] array, int stop) {
        for (int j = 0; j < stop; j++) {
            if (array[j] > array[j + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] array, int start) {
        for (int j = start; j < array.length - 1; j++) {
            if (array[j] < array[j + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int getPeakIndex(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isMountain(int[] array) {
        int peak = getPeakIndex(array);
        if (isIncreasing(array, peak) && isDecreasing(array, peak)) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        // String[] testWords = {"apple", "pear", "this", "cat"};
        // Exam2014 ws1 = new Exam2014(testWords);
        // for (String s:ws1.mixedWords(testWords)) {
        // System.out.println(s);
        // }
        // System.out.println(ws1.mixedWords(testWords));
        int[] array = { 11, 22, 11 };
        System.out.println(getPeakIndex(array));

    }
}
