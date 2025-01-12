package Finals;

public class Customer {

    private String name;
    private int idNum;

    // constructs a Customer with given name and ID number
    public Customer(String name, int idNum) {
        /* implementation not shown */
        this.name = name;
        this.idNum = idNum;
    }

    //returns the customer's name
    public String getName() { 
        /* implementation not shown */ 
        return this.name;
    }

    // returns the customer's id
    public int getID() { 
        /* implementation not shown */ 
        return this.idNum;
    }

    // returns 0 when this customer is equal to other;
    // a positive integer when this customer is greater than other;
    // a negative integer when this customer is less than other
    public int compareCustomer(Customer other) { 
        /* to be implemented in part (a) */
        return this.getID() - other.getID();
    }

    // There may be fields, constructors, and methods that are not shown.

    public static void main(String[] args) {
        Customer c1 = new Customer("Smith", 1001);
        Customer c2 = new Customer("Anderson", 1002);
        Customer c3 = new Customer("Smith", 1003);

        System.out.println(c3.compareCustomer(c1));
    }
}