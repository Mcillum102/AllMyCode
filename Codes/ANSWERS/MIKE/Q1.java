// Q1 	8/9
public class Q1 {

	//Question a)	5/5
	public int scoreGuess(String guess)
	{
		int score = 0;
		int n = guess.length();
		for(int i = 0; i <= secret.length() - n; i++){
			if(guess.equals(secret.substring(i, i - n)))
				score++;
		return score n * n;
		// missing } and * symbols in parts
		// no penalty but warning
	}

	// question b)	4/4
	public String findBetterGuess(String guess1, String guess2) {
		int score1 = scoreGuess(guess1);
		int score2 = scoreGuess(guess2);
		if (score1 > score2 || score1 == score2 && guess1.compareTo(guess2) > 0)
			return guess1;
		else
			return guess2;
	}

}