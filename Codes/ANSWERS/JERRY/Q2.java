// Q2	8/9
public CombinedTable class {
// -1 wrong order of class and class name
	private singleTable t1;
	private singleTable t2;

	public CombinedTable(singleTable t1, singleTable t2){
		this.t1 = t1;
		this.t2 = t2;
	}

	public boolean canSeat(int people){
		if (people > t1.getNumSeats() + t2.getNumSeats() -2){
			return false;
		}

		return true;
	}

	public double getDesirability(){
		if (t1.getHeight() == t2.getHeight()){
			return (t1.getViewQuality() + t2.getViewQuality())/2;
		}

		return (t1.getViewQuality() + t2.getViewQuality())/2 - 10;
	}
}