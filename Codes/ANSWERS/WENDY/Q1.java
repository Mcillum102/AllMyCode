// Q1   7/9
public class Q1 {

    // Q1.a     3/5
    public int scoreGuess(String guess) {
        int count = 0;
        for (int i = 0; i <= secret.length() - guessLength; i++) {
            if (secret.substring(i, i + guessLength).equals(guess)) {
                count++;
            }
        }
        return count * guessLength * guessLength;
        // -2 variable guessLength is not defined
    }

    // Q1.b     4/4
    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            reurn guess2;   // check your spelling
        } else if (score1 = score2) {
            reurn guess1;   // check your spelling
        }
    }
}