package PracticeMock;

public class PasswordChecker {
    public static int numDigits(String s) {
        return 0;
    }

    public static int numLetters(String s) {
        return 0;
    }

    public static int numSymbols(String s) {
        // is s = "R2@n49", then there are 6 elements
        // how to know there are 6 items in s???
        // int length = s.length(); // 6 items
        return s.length() - numDigits(s) - numLetters(s);
    }

    public static String passwordStrength(String p) {
        if (p.length() >= 8) {
            if (numDigits(p) >= 1 && numLetters(p) >= 1 && numSymbols(p) >= 1) {
                return "strong";
            }
            return "medium";
        } else if (p.length() >= 5) {
            if (numSymbols(p) >= 1) {
                return "medium";
            }
            return "weak";
        }
        return "weak";
    }
}
