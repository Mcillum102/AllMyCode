package PracticeMock;

public class ContestOrganizer {
    public static final int NUM_ROWS = 4;

    public static final int CONTESTANTS_PER_ROW = 3;

    private Contestant[][] contestants;

    private void sort(Contestant[] arr) {}

    public void sortAllRows() {
        // this is sorting the 2d array
        // we can use sort() to sort each row
        for (int i = 0; i < contestants.length; i++) {
            // what is contestants[i]? 
            sort(contestants[i]);
        }
    }

    public String findWinnerName() {
        sortAllRows();
        int highest = contestants[0][CONTESTANTS_PER_ROW].getScore();
        String person = contestants[0][CONTESTANTS_PER_ROW].getName();
        for (int i = 1; i < contestants.length; i++) {
            int current = contestants[i][CONTESTANTS_PER_ROW].getScore();
            String currPerson = contestants[i][CONTESTANTS_PER_ROW].getName();
            if (current > highest) {
                highest = current;
                person = currPerson;
            }
        }
        return person;
    }
}
