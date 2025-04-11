package javajerry;
import java.util.ArrayList;
import java.util.List;

public class ArrayListLesson2 {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> cars = new ArrayList<String>();

        List<Integer> carYear = new ArrayList<Integer>();

        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ford");
        cars.add(2, "Benz");
        carYear.add(123);
        System.out.println(cars.size());
        cars.set(3, "Toyota");
        cars.remove(cars.size() - 1);

        System.out.println(cars);
        /* How to print each car's brand name out */
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}