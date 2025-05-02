package javajerry.Mock2024;

public class ISBN {
    private int isbn;

    public ISBN(int isbn){
        this.isbn = isbn;
    }
    public String calculateCheckDigit(){
        int temp = isbn;
        int sum = 0;
        for (int i = 2; i <= 10; i++){
            sum += temp % 10 * i;
            temp /= 10;
        }
        int digit = 11 - (sum % 11);
        if (digit == 10){
            return "X";
        }
        return "" + digit;
    }
    public String generateNumber(){
        return isbn + "-" + this.calculateCheckDigit();
    }
}
