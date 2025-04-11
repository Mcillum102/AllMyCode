package javajerry.AP2023;

public class Sign {

    private String message;
    private int width;

    public Sign(String message, int width){
        this.message = message;
        this.width = width;
    }
    public int numberOfLines(){
        return message.length()/width;
    }

    public String getLines(){
        String line = "";
        for (int i = 0; i < message.length();i += width){
            if ((i + width) < message.length()){
                line += message.substring(i,i+width);
                line += ";";
            } else {
                line += message.substring(i);
            }
        }
        return line;
    }
}
