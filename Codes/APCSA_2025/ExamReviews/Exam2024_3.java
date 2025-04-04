import java.util.ArrayList;

public class Exam2024_3 {

    private ArrayList<String> wordList;

    public Exam2024_3(ArrayList<String> wL) {
        wordList = wL;
    }

    public boolean isWordChain() {
        boolean isSubstring = true;
        for (int i = 1; i < wordList.size(); i++) {
            if (isSubstring == false) {
                return isSubstring;
            }
            String currWord = wordList.get(i);
            String preWord = wordList.get(i - 1);
            int preWordSize = preWord.length();
            for (int j = 0; j <= currWord.length()-preWordSize; j++) {
                String subC = currWord.substring(j, j + preWordSize);
                if (subC.equals(preWord)) {
                    isSubstring = true;
                    break;
                } else {
                    isSubstring = false;
                }
            }
        }
        return isSubstring;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("catch");
        words.add("bobcat");
        words.add("catchacat");
        words.add("cat");
        words.add("at");
        // Exam2024_3 wordchecker = new Exam2024_3(words);

        // System.out.println(wordchecker.isWordChain());

        String w = "cat";
        String newWord = words.get(4).substring(w.length());
        System.out.println(newWord);


    }
}
