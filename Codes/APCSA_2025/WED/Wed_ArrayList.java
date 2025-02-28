

import java.util.*;

public class Wed_ArrayList {

    public static void main(String[] args) {

        // How to declare an ArrayList?
        List<String> strAL = new ArrayList<String>();
        List<Integer> intAL = new ArrayList<Integer>();

        // System.out.println(intAL);

        // The type of your ArrayList is the Interface, which is List.
        // After writing list, we follow wiht <>; in between, you declare the object
        // type that you will store in the list
        // After that is the variable name.
        // after the = and new, is the constructor, which you will indicate the actually
        // class type here.

        strAL.add(0, "Computer0");
        strAL.add("Computer1");
        strAL.add("Computer2");
        strAL.add("Computer3");
        strAL.add("Computer4");
        strAL.add(4, "Wednseday");

        for (String s:strAL) {
            System.out.println(s);
        }

        // System.out.println(strAL.get(3));

        // System.out.println(strAL.size());

        // System.out.println(strAL.set(1, "Laptop"));

        // String removed = strAL.remove(2);
        // System.out.println(removed);

        // System.out.println(strAL);

        List<Integer> nums = new ArrayList<>();

        nums.add(0);
        nums.add(0);
        nums.add(4);
        nums.add(2);
        nums.add(5);
        nums.add(0);
        nums.add(3);
        nums.add(0);

        int k = 0;
        Integer zero = 0;
        while (k < nums.size()) {
            if (nums.get(k).equals(zero))
                nums.remove(k);
            k++;
        }

        System.out.println(nums);

    }
}