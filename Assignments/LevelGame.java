public class LevelGame {
    
    /*
     * Returns the total score of the most recent game
     * Each game has three level
     * Each level has a goal to reach
     */
    public int getScore() {
        int score = 0;
        // How to know if the level goal is reached?
        if (levelOne.goalReached()) {
            score += levelOne.getScore();
        }
        if (levelTwo.goalReached()) {
            score += levelTwo.getScore();
        }
        if (levelThree.goalReached()) {
            score += levelThree.getScore();
        }
        if (isBonus()) {
            score *= 3;
        }
        return score;
    }

    public int playManyTimes(int num) {
        int score = 0, highest = 0;
        while (num > 0) {
            play();
            score = getScore();

            if (score > highest) {
                highest = score;
            }
            num--;
            // num -= 1;
        }
        return highest;
    }

}
