package javajerry;

public class CheckDigit {
    
    public static int getCheck(int num) {
        int multiplier = 7;
        int digit = 1;
        int sum = 0;

        while (digit <= getNumberOfDigits(num)) {
            sum += getDigit(num, digit) * multiplier;

            digit++;
            multiplier--;
        }

        int rightmostDigit = sum % 10;
        return rightmostDigit;
    }

    public static boolean isValid(int numWithCheckDigit) {
        int checkNum = numWithCheckDigit % 10;
        int originalNum = numWithCheckDigit / 10;

        if (checkNum == getCheck(originalNum)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getNumberOfDigits(int num) {
        String numString = Integer.toString(num);

        return numString.length();
    }

    public static int getDigit(int num, int n) {
        String numString = Integer.toString(num);
        String digitString = numString.substring(n-1, n);

        int digit = Integer.parseInt(digitString);
        
        return digit;
    }

    public static void main(String[] args) {

        System.out.println(getCheck(159));
        System.out.println(isValid(1593));
    }
}
