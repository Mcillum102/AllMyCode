public class hhh {
    
    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))  {
                    return false;
                }
            
        }
        return true;
    }

public static void main(String[] args) {
    boolean str1 = sameStarChar("*12211*");
    System.out.println(str1);       // true
    boolean str2 = sameStarChar("12*333");
    System.out.println(str2);    // false
    boolean str3 = sameStarChar("15*53");
    System.out.println(str3);    // true
}
}
