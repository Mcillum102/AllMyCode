package SAT;

import java.util.*;

public class Sat_ArrayList {
    
    public static void main(String[] args) {
        
        // To delcare an ArrayList object, the steps are:
        // The type for ArrayList object is List. The constructor is ArrayList() itself
        // We also need to delcare the object type that will be stored in this ArrayList together.
        // To do it, we use <> with object type name inside. Also with the constructor
        List<String> strAL = new ArrayList<String>();

        // Think about how to create an Integer ArrayList named intAL?
        // What should be put in between <>? (Look at the above line again to find the object type name for int)
        List<Integer> intAL = new ArrayList<Integer>();

        // Adding element to an arraylist, don't get you are using arraylist name to call the method
        strAL.add("White Board1");
        strAL.add("White Board2");
        strAL.add("White Board3");
        strAL.add("White Board4");
        strAL.add("White Board5");

        // When we add with index, you add the word to the index place and move all other to the right
        strAL.add(2, "Computer");

        // .get() returns the value at given index
        System.out.println("At index 4, we have: " + strAL.get(4));

        // .set() change the value at given index to another object
        // it also returns what has been replaced
        System.out.println("We change " + strAL.set(1, "Desk") + " to new word");

        // .remove() deletes the object at given index and moves all item to the left
        // it also returns what has been removed
        System.out.println("We removed " + strAL.remove(3));

        // .size() will print the amount of items in arraylist
        System.out.println(strAL.size());
        System.out.println(strAL); // You can print an arraylist directly to see the items inside
    }
}
