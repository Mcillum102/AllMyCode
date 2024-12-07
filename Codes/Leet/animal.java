public class animal { 
    private int legLength 
    private String Color;
    private int tailLength;
    private String trunkColor;
    private int runDistance;
    
    
        public animal ( int theLegLength, String theColor, int theTailLength, String theTrunkColor, int theRunDistance){
            this.legLength = theLegLength;
            this.Color = theColor;
            this.tailLength = theTailLength;
            this.trunkColor = theTrunkColor;
            this.runDistance = theRunDistance;
        }
    
        public int getRunDistance(){
            return this.runDistance;
        }
    
        public void setRunDistance (int newRunDistance) {
            this.runDistance = getRunDistance();
    }

public String checkRunDistance(){
    if (getRunDistance()>15){
        return "The first animal runs further";
    }
    return "The second animal runs further";
}
    
public static void main(String[] args) {
   
    animal animal1 = new animal(4, "teal", 3, "gray", 15);
    animal animal2 = new animal(8, "black", 6, "white", 24);

    animal1.setRunDistance(22);
    System.out.println(animal1.getRunDistance());
    System.out.println(animal2.getRunDistance());   
    
    }
}