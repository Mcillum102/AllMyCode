// Q2 	6/9
//question a)
public class SingleTable {

	private singleTable table1;
	// has 4 seats, a view quality(desirability) of 60.0, and a height of 74
	// centimeters
	private singleTable table2;
	// has 8 seats, a view quality of 70.0, and a height of 74 centimeters

	
}

// -1 wrong class declaration
// -1 wrong declaration of fields
// -1 wrong constructor
public class combinedTable(
SingleTable t1, SingleTable t2)
{
		table1 = t1;
		table2 = t2;

	}

// +3 correct method
public canSeat(int people)
{
	return table1.getNumSeats() + table2.getNumSeats() - 2 >= people;
}

// +3 correct method
public double getDesirability()
{
	double avg = (table1.getViewQuality() + table2.getViewQuality()) / 2;
	if(table1.getHeight() == table2.getHeight())
		return avg
	else
		return avg - 10;		
}
