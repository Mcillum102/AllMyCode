package javajerry;

public class Player extends Person{
    private String position;
    
    public Player(String name, int age, String position){
        super(name, age);
        this.position = position;
    }

    public void changePosition(String newPosition){
        this.position = newPosition;
    }

}
