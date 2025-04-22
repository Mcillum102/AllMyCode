package javajerry.AP2023;

public class StepTracker {
    private int goal;
    private int activeDay;
    private int steps;
    private int days;

    public StepTracker(int goal) {
        this.goal = goal;
        this.days = 0;
        this.steps = 0;
        this.activeDay = 0;
    }

    public void addDailysteps(int numSteps) {
        if (numSteps >= goal) {
            activeDay++;
        }
        steps += numSteps;
        days++;
    }

    public int activeDays() {
        return activeDay;
    }

    public double averagesteps() {
        return (double) steps / days;
    }
}
