public class Password {

    private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lower = "abcdefghijklmnopqrstuvwxyz";
    private String symbols = "!@#$%^&*";
    private int minLength;
    private int maxLength;

    public Password(int min, int max) {
        minLength = min;
        maxLength = max;
    }

    public boolean isValid(String password) {
        int upperCounts = 0;
        int lowerCounts = 0;
        int symbolCounts = 0;
        if (password.length() >= minLength && password.length() <= maxLength) {
            for (int i = 0; i < password.length(); i++) {
                // Use substring to get the letter from password
                String letter = password.substring(i, i + 1);
                // indexOf() returns -1 when it doesn't have the string we search for
                if (upper.indexOf(letter) != -1) {
                    upperCounts++;
                } else if (lower.indexOf(letter) != -1) {
                    lowerCounts++;
                } else if (symbols.indexOf(letter) != -1) {
                    symbolCounts++;
                }
            }
            if (upperCounts != 0 && lowerCounts != 0 && symbolCounts != 0) {
                return true;
            }
        }
        return false;
    }

    public String generatePassword() {
        /*
         * Math.random() will return a double n where: 0 <= n < 1
         * Math.random() * a will return: 0 <= n < a (difference, not inclusive)
         * Math.random() * a + b will return: b <= n < a + b
         * Ex: if i want to generate a number between 10 - 30, not include 30
         * Math.random() * (30 - 10) + 10
         */

        String password = "";

        // cast only works with primitive type
        int length = (int) (Math.random() * (maxLength - minLength + 1) + minLength);

        while (!isValid(password)) {
            for (int i = 0; i < length; i++) {
                int random = (int) (Math.random() * 3);
                if (random == 0) {
                    int randomlower = (int) (Math.random() * (lower.length()));
                    password += lower.substring(randomlower, randomlower + 1);
                } else if (random == 1) {
                    int randomupper = (int) (Math.random() * (upper.length()));
                    password += upper.substring(randomupper, randomupper + 1);
                } else if (random == 2) {
                    int randomsymbol = (int) (Math.random() * (symbols.length()));
                    password += symbols.substring(randomsymbol, randomsymbol + 1);
                }
            }
            if (isValid(password)) {
                break;
            } else {
                password = "";
            }
        }
        return password;
    }

    public static void main(String[] args) {
        Password p1 = new Password(2, 6);
        System.out.println(p1.isValid("#APComputerScience Rocks"));
        System.out.println(p1.generatePassword());
    }

}