// Q1	7/9
// a) 	4/5
	public int scoreGuess(String guess){
		int count = 0;
		int total = 0;
		for(int i = 0 ; i <= secret.length() ; i++){
			String new = secret.substring(i,i+secret.length())
		
			if(new == guess){
				// don't name your variable new
				// -1 wrong way to compare strings
			count++
		}
}		
		total = count*guess.length()*guess.length();
		return total;
}




// b) 	3/4
	public String findBetterGuess(String guess1, String guess2){
		int number1 = scoreGuess(guess1);
		int number2 = scoreGuess(guess2);
		if(number1>number2){
		return guess1;
}
		if(number2>number1){
		return guess2;
}
		if(number1=number2){
			// -1 didn't use compareTo to find out whose name is alphabetically smaller
		return guess1;
}
		return guess2;
}