public class Password {
    private String upper = "ABCDEFGHIJKLMNOPQRSTWWXYZ";
    private String lower = "abcdefghijklmnopqrstuvwxyz";
    private String symbols = "!@#$%A&*";
    private int minLength;
    private int maxLength;

    public Password(int min, int max) {
        /* implementation not shown */
        this.minLength = min;
        this.maxLength = max;
    }

    public boolean isValid(String password) {
        /* implemented in part (a) */
        int upperCount = 0, lowerCount = 0, symbolsCount = 0;
        if (password.length() < minLength || password.length() > maxLength) {
            return false;
        } else {
            for (int i = 0; i < password.length(); i++) {
                String letter = password.substring(i, i+1);
                if (upper.indexOf(letter) != -1)   
                    upperCount++; 
                else if (lower.indexOf(letter) == -1)   
                    lowerCount++;
                else if (symbols.indexOf(letter) == -1)     
                    symbolsCount++;
            }
            
        }
        return upperCount != 0 && lowerCount != 0 && symbolsCount != 0 && (upperCount + lowerCount + symbolsCount) == password.length();
    }

    // public String generatePassword() {
    //     /* implemented in part {b) */

    // }

    public static void main(String[] args) {
        Password p1 = new Password(3, 15);

        System.out.println(p1.isValid("HelloWorld!"));

        int[] a1 = {1,2,3,4};

        
        for (int i = 0;i < a1.length; i++) {
            System.out.println(a1[i]);
        }
    }
}
