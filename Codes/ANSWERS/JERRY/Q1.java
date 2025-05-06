// 9/9
public class Q1 {
	// Q1.a
	public int scoreGuess(String guess) {
		int count = 0;
		for (int i = 0; i < secret.length() - guess.length(); i++) {
			if (guess.equals(secret.substring(i, i + guess.length()))) {
				count++;
			}
		}
		return count * guess.length() * guess.length();
	}

	// Q1.b
	public String findBetterGuess(String guess1, String guess2) {
		if (scoreGuess(guess1) > scoreGuess(guess2)) {
			return guess1;
		}
		if (scoreGuess(guess1) == scoreGuess(guess2)) {
			if (guess1.compareTo(guess2) > 0) {
				return guess1;
			} else
				return guess2;
		}
		return guess2;
	}
}