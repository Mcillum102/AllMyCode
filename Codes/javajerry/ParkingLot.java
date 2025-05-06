package javajerry;

public class ParkingLot {
    
    public int openSpaces(){
        int count = 0;
        for (int i = 0; i < lot.length; i++){
            for (int j = 0; j < lot[0].length; j++){
                if (lot[i][j] == null){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean parkCar(Car newCar){
        if (openSpaces() > 0){
            for (int i = 0; i < lot.length; i++){
                for (int j = 0; j < lot[0].length; j++){
                    if (lot[i][j] == null){
                        lot[i][j] = newCar;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
