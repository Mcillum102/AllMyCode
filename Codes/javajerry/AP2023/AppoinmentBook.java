package javajerry.AP2023;
public class AppoinmentBook {
    private boolean isMinuteFree(int period, int minute) {
        return true;
    }

    private void reserveBlock(int period, int startMinute, int duration) {

    }

    public int findFreeBlock(int period, int duration) {
        int totalTime = 0;
        for (int i = 0; i <= 59; i++){
            if (isMinuteFree(period, i)) {
                totalTime++;
            } else {
                totalTime = 0;
            }
            if (totalTime>=duration){ 
                return i-duration+1;
            }
        }
        return -1;
    }

    public boolean makeAppoinment(int startPeriod, int endPeriod, int duration) {
        for (int i = startPeriod; i <= endPeriod; i++){
            if (findFreeBlock(i,duration) > 0) {
                reserveBlock(i,findFreeBlock(i,duration),duration);
                return true;
            }
        }
        return false;
    }
}