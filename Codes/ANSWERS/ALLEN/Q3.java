// Q3   3/9
public class Q3 {
    // Q3.a 3/3
    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            MemberInfo temp = new MemberInfo(name, gradYear, true);
            memberList.add(temp);
        }

    }

    // Q3.b 0/6
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> members;
        // -1 Declaration is not complete; missing new ArrayList<MemberInfo>()

        for (MemberInfo member : memberList) {
            if (member.getGradYear() > year) {
                members += member;

            }

            return members;
        }
        // -5 incorrect use of for-each loop
        // and missing return statement

    }
}