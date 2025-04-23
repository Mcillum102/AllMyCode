public class ScoreBoard {
    
    private String teamOne;
    private String teamTwo;
    private int teamOneStatus;      
    private int teamTwoStatus;      
    private int teamOneScore;
    private int teamTwoScore;

    public ScoreBoard(String team1, String team2) {
        teamOne = team1;
        teamTwo = team2;
        teamOneStatus = 1;          // 1 means active
        teamTwoStatus = 0;          // 0 means inactive
    }

    public void recordPlay(int points) {
        
    }

    public String getScore() {
        if (teamOneStatus == 1) {
            return teamOneScore +  "-" + teamTwoScore + "-" + teamOne;
        }
        return teamOneScore +  "-" + teamTwoScore + "-" + teamTwo;
    }
}
