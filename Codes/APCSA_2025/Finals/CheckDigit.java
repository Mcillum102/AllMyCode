public class CheckDigit {
    /**
     * Returns the check digit for num, as described in part (a).
     * Precondition: The number of digits in num is between one and six, inclusive.
     * num >= 0
     */
    public static int getCheck(int num) {
        /* to be implemented in part (a) */

        // result variable to store the value for additions
        int result = 0;

        // multiplier variable that we need to multiplier for. It will also decrease 1 each time during loop.
        int multiplier = 7;

        // Initialize:  For loop should start from 1, as the n parameter in getDigit() starts from 1.
        // Condition:   I should be less than or equal to the number of digits in num, where we use getNumberOfDigits() method.
        // Changes:     Each time, i will increase by 1 to move to the next digit.
        for (int i = 1; i <= getNumberOfDigits(num); i++) {

            // Add the result with the digit at the ith position of num, multiplied by the multiplier.
            // Ex: for number 283415; 2 * 7 + 8 * 6 + ... + 5 * 2
            result += getDigit(num, i) * multiplier;

            // Decrease the multiplier by 1.
            multiplier--;
        }

        // After this loop, I can get the result of whats asked.
        // Now, we need to extract the rightmost digit. Using modulus 10, we can get the rightmost digit.
        return result % 10;
    }

    /**
     * Returns true if numWithCheckDigit is valid, or false otherwise, as described in part (b).
     * Precondition: The number of digits in numWithCheckDigit is between two and seven, inclusive.
     * numWithCheckDigit >= 0
     */
    public static boolean isValid(int numWithCheckDigit) {
        /* to be implemented in part (b) */

        // Extract the check digit from the number by / 10 and store it in a variable.
        // Ex: 283415 / 10 = 28341
        int num = numWithCheckDigit / 10;

        // Extract the check digit from the number by % 10 and store it in a variable.
        // Ex: 283415 % 10 = 5
        int check = numWithCheckDigit % 10;

        // Check if the check digit is equal to the getCheck() method of the num.
        // If they are equal, return true, otherwise return false.
        return check == getCheck(num);
    }
    
    /** Returns the number of digits in num. */
    public static int getNumberOfDigits(int num) {
        /* implementation not shown */
        String number = Integer.toString(num);
        return number.length();
    }

    /**
     * Returns the nthdigit of num.
     * Precondition: n >= 1 and n <= the number of digits in num
     */
    public static int getDigit(int num, int n) {
        /* implementation not shown */
        String number = Integer.toString(num);
        String digit = number.substring(n-1, n);
        return Integer.valueOf(digit);
    }

    // There may be instance variables, constructors, and methods not shown.
}