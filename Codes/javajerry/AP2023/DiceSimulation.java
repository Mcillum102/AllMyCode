package javajerry.AP2023;

public class DiceSimulation {
    private int numSampleSize;      
    private int numFaces;           

    public DiceSimulation(int numSamples, int faces) {
        numSampleSize = numSamples;
        numFaces = faces;
    }

    public int roll() {
        return (int)((Math.random() * numFaces) + 1);
    }

    public int runSimulation() {
        int equal = 0;
        for (int i = 0; i < numSampleSize; i++){
            int roll1 = roll();
            int roll2 = roll();
            if (roll1 == roll2){
                equal++;
            }
        }
        return (int)(((double)equal/numSampleSize)*100);
    }
}
