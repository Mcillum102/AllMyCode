// Q1     5/9
public class Q1 {
     // Q1.a  5/5
     // Public int scoreGuess(String guess) {
     // the above is your method name with capital Public
     // no penalty for this but prefer to use lowercase
     public int scoreGuess(String guess) {
          int num = 0;
          int len = guess.length();
          for (int i = 0; i <= secret.length() - len; i++) {
               if (secrect.substring(i, i + len).equals(guess)) {
                    num++;
               }
          }
          return num * len * len;
     }

     // Q1.b   0/4
     public String findBetterGuess(String guess1, String guess2) {
          int s1 = scoreGuess(guess1);
          int s2 = scoreGuess(guess2);
          if (s1 > s2) {
               return s1;
          } else if (s2 > s1) {
               return s2;
          } else {
               if (secret.indexOf(guess1) <= secret.indexOf(guess2)) {
                    return s1;
               } else {
                    return s2;
               }
          }
     }
     // -4 returning int instead of String
}