// Q2 	4/9

Q2) pub0lic class SingleTable{
	public int getNumSeats()

	public int getHeight()

	public double getViewQuality()

	public void setView Quality(double value)
}


public class CombinedTable{
	private SingleTable t1;
	private SingleTable t2;

	// -1 no constructor
	public boolean canSeat(int people){
        int total = t1.getNumSeats+t2.getNumSeats;
		// -1 wrong formula
        if (total >= people) {
            return true;
}
        return false;
}
	public double desirability(){
	double desirable = (t1.getViewQuality+t2.getViewQuality)/2;
}
	desirable = desirable-10;
	return desirable;
	// -1 no condition check for return value
	// -1 no call to method getHeight
}
