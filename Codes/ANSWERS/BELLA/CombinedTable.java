// Q2     5/9
// public class SingleTable {
// -1 wrong class name
public class CombinedTable {
     private SingleTable table1;
     private SingleTable table2;

     public CombinedTable(SingleTable t1, SingleTable t2) {
          this.table1 = t1;
          this.table2 = t2;
     }

     public boolean canSeat(int numPeople) {
          return numPeople <= t1.getNumSeats() + t2.getNumSeats() - 2;
          // -1 using wrong fields
     }

     public double grtDesirability() {
          double avg = (t1.getViewQuality() + t2.getViewQuality()) / 2;
          return avg - 10;
          // -1 using wrong fields
          // -1 didn't use getHeight()
     }

     /**
      * Returns the number of seats at this table. The value is always greater than
      * or equal to 4.
      */
     public int getNumSeats() {
          /* implementation not shown */ }

     /** Returns the height of this table in centimeters. */
     public int getHeight() {
          /* implementation not shown */ }

     /** Returns the quality of the view from this table. */
     public double getViewQuality() {
          /* implementation not shown */ }

     /** Sets the quality of the view from this table to value. */
     public void setViewQuality(double value) {
          /* implementation not shown */ }

     // There may be instance variables, constructors, and methods that are not
     // shown.
}
