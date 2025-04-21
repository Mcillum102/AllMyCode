package javajerry.AP2023;

public class FrogSimulation {
    private int goalDistance;       // 目标
    private int maxHops;            // 最大次数

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        return 0;
    }

    /* 1. 抵达或超越终点
     * 2. 往回跳时超过起点
     * 3. 用完所有跳的次数
     */
    public boolean simulate(){
        int distance = 0;
        for (int i = 0; i < maxHops; i++){
            distance += hopDistance();
            if (distance >= goalDistance){
                return true;
            }
            if (distance < 0){
                return false;
            }
        }
        return false;
    } 

    public double runSimulation(int num) {
        int count = 0;
        for (int i = 0; i < num; i++){
            if (simulate()){
                count++;
            }
        }
        return (double) count/num;
    }
    
}