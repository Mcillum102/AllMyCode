import java.util.List;
import java.util.ArrayList;

public class SomeClass {

        private int num;
        
        public SomeClass(int n){
        
            num = n;
        
        }
        
        public void increment(int more){
        
            this.num += more;
        
        }
        
        public int getNum(){
        
            return num;
        
        }
        
        // The following code segment appears in another client class.
        public static void main(String[] args) {
            // Create an ArrayList
            List<String> cars = new ArrayList<String>();
    
            List<Integer> carYear = new ArrayList<Integer>();
    
    
            // Add elements
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");

            carYear.add(2000);
            carYear.add(2001);
            carYear.add(2002);
            carYear.add(2003);
    
            System.out.println(cars.size());
            System.out.println(carYear.get(3));
        }
        
    
}
