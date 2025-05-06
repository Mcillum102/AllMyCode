package javajerry;

public class Q3 {

    public static String getFirstName(String name){
        int x = name.indexOf(" ");
        return name.substring(0,x);
    }

    public static String getLastName(String name){
        int x = name.indexOf(" ");
        return name.substring(x+1);
    }

    public static int countVowels(String name){
        int count = 0;
        for (int i = 0; i < name.length(); i++){
            if (name.substring(i,i+1).equals("a") 
            || name.substring(i,i+1).equals("e") 
            || name.substring(i,i+1).equals("i") 
            || name.substring(i,i+1).equals("o") 
            ||name.substring(i,i+1).equals("u")){
                count++;
            }
        }
        return count;
    }
}
