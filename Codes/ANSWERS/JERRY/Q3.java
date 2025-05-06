// Q3 	9/9
// Q3.a
public void addMembers(String[] names, int gradYear) {
	for (int i = 0; i < names.length; i++) {
		memberList.add(new Memberinfo(names[i], gradYear, true));
	}
}

// Q3.b
public ArrayList<Memberinfo> removeMembers(int year) {
	ArrayList<Memberinfo> newList = new ArrayList<Memberinfo>();
	for (int i = 0; i < memberList.size(); i++) {
		if (memberList.get(i).getGradYear() <= year && memberList.get(i).inGoodStanding()) {
			newList.add(memberList.remove(i));
			i--;
		}
	}
	return newList;
}