// Q3	7/9
public class ClubMembers
{

//question a)	2/3
public void addMembers(String[] names, int gradYear)
{
	for(String names : names)
		memberList.add(new MemberINfo(name, gradYear, true);
	// missing closing ); no penalty
	// -1 wrong variable name used
}

//question b)	5/6
public ArrayList<MemberInfo> removeMembers(int year)
{
	ArrayList <MemberInfo> newList = new ArrayList<MemberInfo>();
	for(int i = 0; memberList.size() - 1; i >= 0; i--)
	{
		// -1 extra declaration of i
		MemberInfo member = memberList.get(i);
		if(member.getGradYear() <= year)
		{
			memberList.remove(i);
			if(member.inGoodStanding())
			newList.add(Member);
		}
	}
return newList;

}
}