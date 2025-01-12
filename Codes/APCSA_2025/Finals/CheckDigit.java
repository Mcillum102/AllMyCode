package Finals;

public class CheckDigit {
    /**
     * Returns the check digit for num, as described in part (a).
     * Precondition: The number of digits in num is between one and six, inclusive.
     * num >= 0
     */
    public static int getCheck(int num) {
        /* to be implemented in part (a) */
        // We want to create a loop that repeats a certain amount of time

        // Always create a varible with value 0 if the question invovles adding.
        int result = 0;
        int multiplier = 7;

        for (int i = 0; i < getNumberOfDigits(num); i++) {
            result += getDigit(num, i) * multiplier;
            multiplier--;
        }

        // result contains the number, how to get the rightmost digit?
        int rightMost = result % 10;;
        return rightMost;
    }

    /**
     * Returns true if numWithCheckDigit is valid, or false otherwise, as described in part (b).
     * Precondition: The number of digits in numWithCheckDigit is between two and seven, inclusive.
     * numWithCheckDigit >= 0
     */
    public static boolean isValid(int numWithCheckDigit) {
        /* to be implemented in part (b) */

    }

    /** Returns the number of digits in num. */
    public static int getNumberOfDigits(int num)
    {/* implementation not shown */}

    /**
     * Returns the nthdigit of num.
     * Precondition: n >= 1 and n <= the number of digits in num
     */
    public static int getDigit(int num, int n)
    {/* implementation not shown */}

    // There may be instance variables, constructors, and methods not shown.

}