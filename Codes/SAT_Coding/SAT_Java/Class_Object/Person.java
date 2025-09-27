package Class_Object;
import java.util.Scanner;

public class Person {

    // Properties
    private String name;
    private int age;
    private double height;
    private String status;

    // Constructor
    // Constructors will initialize a basic value for each object created
    public Person() {
        name = "";
        age = 0;
        height = 0;
        status = "Awake";
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.status = "Awake";
    }

    // Methods
    public void sleep() {
        this.status = "Sleeping";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Eric", 14, 174.5);
        Person p2 = new Person("Jacky", 15, 174.5);
        System.out.println(p1.status);
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want me to do?");
        String s = sc.nextLine();
        if (s.toLowerCase().contains("go to bed")) p1.sleep();
        System.out.println(p1.status);

        sc.close();
    }

}
