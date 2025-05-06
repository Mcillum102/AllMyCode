// Q1 8/9
public class Q1 {
    // Q1.a     4/5
    public int scoreGuess(String guess) {
        int count = 0;
        int multiplier = guess.length() * guess.length();
        int length = guess.length(); // extra variable; no penalty
        for (int i = 0; i < secret.length() - guess.length(); i++) {
            if (str.substring(i, i + guess.length()).equalsTo(guess)) {
                count++;
            }
            // -1 point. Used str not secret
        }
        return count * multiplier;
    }

    // Q1.b     4/4
    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 == score2) {
            if (guess1.compareTo(guess2) > 0) {
                return guess1;
            }
            return guess2;
        } else if (score1 > score2) {
            return guess1;
        }
        return guess2;
    }
}