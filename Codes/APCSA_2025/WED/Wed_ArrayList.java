package WED;
import java.util.*;

public class Wed_ArrayList {
    
    public static void main(String[] args) {
        
        // How to declare an ArrayList?
        List<String> strAL = new ArrayList<String>();
        // The type of your ArrayList is the Interface, which is List.
        // After writing list, we follow wiht <>; in between, you declare the object type that you will store in the list
        // After that is the variable name.
        // after the = and new, is the constructor, which you will indicate the actually class type here.

        strAL.add("Computer");
        strAL.add("Computer");
        strAL.add("Computer");
        strAL.add("Computer");
        strAL.add("Computer");
        strAL.add(4,"Wednseday");

        strAL.get(3);

        System.out.println(strAL.size());

        System.out.println(strAL);
    }
}