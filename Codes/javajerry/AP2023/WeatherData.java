package javajerry.AP2023;

import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Double> temperatures;

    public void cleanData(double lower, double upper) {
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > upper || temperatures.get(i) < lower) {
                temperatures.remove(i);
                i--;
            }
        }
    }

    public int longestHeatWave(double threshold) {
        int sum = 0;
        int longestWave = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > threshold) {
                sum++;
            } else {
                sum = 0;
            }
            if (sum > longestWave) {
                longestWave = sum;
            }

        }
        return longestWave;
    }
}
