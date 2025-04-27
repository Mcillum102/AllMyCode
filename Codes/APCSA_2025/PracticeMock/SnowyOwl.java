package PracticeMock;

public class SnowyOwl extends Owl{
    private boolean gender;
    
    public SnowyOwl() {
        super("Sonwy owl");
    }

    public String getColor() {
        if (gender) {    // this means if the boolean variable is true
            return "white";
        }
        return "speckled";
    }

    public String getFood() {
        return "hare, lemming, or small bird";
    }
}
