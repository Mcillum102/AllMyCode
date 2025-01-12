public class Customer {
    private String name;
    private int idNum;
    // constructs a Customer with given name and ID number
    public Customer(String name, int idNum) {
        /* implementation not shown */
        this.name = name;
        this.idNum = idNum; 
    }

    // returns the customer's name
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
        // Step 1: Check if the two names are the same
        if (this.getName().equals(other.getName())) {
            // Step 1.2: We need to continue compare the idNum
            // when we minus the two idNum, it gives us the different between them. 0 means the idNums are the same; positive means this is larger than other.
            return this.getID() - other.getID();
        } else {
            // Step 2: When they have differnet names, compareTo can gives us a number that shows which one is greater or less
            return this.getName().compareTo(other.getName());
        }
    }

    // There may be fields, constructors, and methods that are not shown.

}
