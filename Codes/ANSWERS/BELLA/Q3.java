// Q3     7/9
public class Q3 {
// Q3.a   3/3
     public void addMembers(String[] names, int gradYear) {
          for (String name : names) {
               memberList.add(new MemberInfo(name, gradYear, true));
          }
     }

// Q3.b   4/6
     public ArrayList<MemberInfo> removeMembers(int year) {
          ArrayList<MemberInfo> graduated = new ArrayList<>();
          ArrayList<MemberInfo> needRemove = new ArrayList<>();
          for (MemberInfo member : memberList) {
               if (member.getGradYear() <= year) {
                    if (member.inGoodStanding()) {
                         graduated.add(member);
                    }
                    needRemove.add(member);
               }
          }
          // -1 didn't use get(i) in for loop
          memberList.removerAll(needRemove);
          // -1 removeAll is not allowed to be used
          return graduated;
     }
}