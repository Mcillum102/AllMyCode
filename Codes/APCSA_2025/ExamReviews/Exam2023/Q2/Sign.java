package Exam2023.Q2;

public class Sign {
    private String message;
    private int width;
    
    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        int len = message.length(); // number of words
        // width is how many words can be put in one line
        int numLines = len / width;
        // if there are remainding letters, we add one more line.
        if (len % width != 0) {
            numLines++;
        }
        return numLines;
    }

    public String getLines() {
        String line = "";
        // we will remake the message
        // each time, we add a line amount of characters into line
        // then, we insert a semicolon
        // we start again with the next line amount into line
        int index = 0;
        int w = width;
        // we use index - w to select the whole line and add it into line str
        // after that, we add a ";" to separete.

        for (int i = 0; i < numberOfLines(); i++) {
            if (w < message.length()) { 
                // when your ending index is still in range of message,
                // we add the message, and a semi colon
                line += message.substring(index, w);
                line += ";";
            } else {
                // when your ending index is beyound the length,
                // we don't need to add a semi colon
                line += message.substring(index);
            }
            index += width;
            w += width;
        }
        if (line.equals("")) {
            return null;
        }
        return line;
    }

    public static void main(String[] args) {
        String str;
        int x;
        Sign sign1 = new Sign("AB_CD_EF", 2);
        x = sign1.numberOfLines();
        System.out.println(x);
        str = sign1.getLines();
        str = sign1.getLines();
        System.out.println(str);
    }
}
