package Codes.APCSA_2025.ExamReviews.Exam2023.Q4;

public class BoxOfCandy {
    
    private Candy[][] box;


    public boolean moveCandyToFirstRow(int col) {
        if (box[0][col] != null) {
            return true;
        }
        for (int i = 1; i < box.length; i++) {
            if (box[i][col] != null) {
                box[0][col] = box[i][col];
                box[i][col] = null;
                return true;
            }
        }
        return false;
    }

    public Candy removeNextByFlavor(String flavor) {
        Candy curr = null;
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                curr = box[i][j];
                if (curr.getFlavor().equals(flavor)) {
                    box[i][j] = null;
                    return curr;
                }
            }
        }
        return curr;
    }
}
