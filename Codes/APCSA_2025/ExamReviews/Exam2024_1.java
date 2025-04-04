import java.util.ArrayList;

public class Exam2024_1 {

    private int currentFood;

    public Exam2024_1(int cF) {
        currentFood = cF;
    }

    public void simulateOneDay(int numBirds) {
        int foodPerBird = (int)(Math.random()*41+10);
        int totalFood = numBirds * foodPerBird;
        int bearOrNo = (int)(Math.random()*2);
        if (bearOrNo == 0) {
            if (currentFood >= totalFood) {
                currentFood -= totalFood;
            } else {
                currentFood = 0;
            }
        } else {
            currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        for (int day = 0; day < numDays; day++) {
            if (currentFood == 0) {
                return day;
            }
            simulateOneDay(numBirds);
        }
        return numDays;
    }

    public static void main(String[] args) {
        Exam2024_1 feeder = new Exam2024_1(1000);
        // feeder.simulateOneDay(10);
        // System.out.println(feeder.currentFood);

        System.out.println(feeder.simulateManyDays(10, 4));
    }
}