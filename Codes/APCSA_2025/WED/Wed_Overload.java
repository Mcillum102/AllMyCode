package WED;


public class Wed_Overload {

    private String name;

    public Wed_Overload() {}

    public Wed_Overload(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hi";
    }

    public String greet(String who) {
        return this.name + " says hello to " + who;
    }

    public String greet(int number) {
        return "Hello " + number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String doSomething(Wed_Overload other) {
        return greet() + other.greet();
    }

    public static void main(String[] args) {
     Wed_Overload obj1 = new Wed_Overload();
        
        System.out.println(obj1.greet("Norman"));
        // System.out.println(obj1.greet(47));

        // Create an object obj2 that has the name "Martin"
     Wed_Overload obj2 = new Wed_Overload("Martin");
        System.out.println(obj2.greet(42));

        System.out.println(obj1.doSomething(obj2));
    }

}
