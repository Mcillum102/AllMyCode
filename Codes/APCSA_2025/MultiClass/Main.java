package MultiClass;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle v1 = new Vehicle();
        c1.setModel("Y");
        System.out.println(c1.getModel());
        c1.driveForward(1000);

        // You want to remember the difference between variable type and object type
        // variable type determines where the object can be stored.
        // object type determines what the object has access to.

        // For a parent type, it is able to store a child object
        Vehicle v2 = new Vehicle();
        v2.driveForward(4000);

        // We can change the object v2 points to another child with no errors.
        // v2 = new Airplane();

        // Parent type and Children type can be store together in the same Parent type Array or ArrayList.
        List<Vehicle> vAL = new ArrayList<Vehicle>();
        System.out.println(vAL.add(v1));
        System.out.println(vAL.add(v2));
        System.out.println(vAL.add(c1));

        // Not allowed to store parent object to a children variable
        // Car c2 = new Vehicle();
        Car c2 = new Car("Ferrari", "202", 2024, 4, 40000.0, "Sport");
        Object obj = new Object();

        Airplane a1 = new Airplane();
    }
}
