public class LocationNumeral {
    // index: 0123456789..
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public int getLetterValue(String letter) {
        // Step 1: Find the index number of letter in alphabet
        int index = alphabet.indexOf(letter);
        // Step 2: return 2 raised to the power of index
        return (int) Math.pow(2, index);
    }

    public int getDecimalValue(String letter) {
        int value = 0;
        for (int i = 0; i < letter.length(); i++) {
            value += getLetterValue(letter.substring(i, i+1));
        }
        return value;
    }

    public String buildLocationNumeral(int value) {
        int exp = 0, temp = value;
        String numeral = "";
        while (temp >= 2) {
            temp /= 2;
            exp++;
        }

        while (value > 0) {
            int num = (int) Math.pow(2, exp);
            if (value >= num) {
                value -= num;
                numeral += alphabet.substring(exp, exp + 1);
            }
            exp--;
        }
        return numeral;
    }

    public static void main(String[] args) {
        LocationNumeral l1 = new LocationNumeral();

        System.out.println(l1.getLetterValue("D"));
        System.out.println(l1.getDecimalValue("ECA"));
        System.out.println(l1.buildLocationNumeral(43));
    }
}
