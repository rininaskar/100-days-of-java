public class Challenge19 {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 9;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 5;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " +  highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Pere", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore > 1000) {
//            return 1;
//        } else if (playerScore > 500) {
//            return 2;
//        } else if(playerScore > 100 ) {
//            return  3;
//        }
//        return 4;
        int position = 4;  //assuming position 4 will be returned
        if (playerScore >=  1000) {
            position = 1;
        } else if (playerScore >=  500) {
            position = 2;
        } else if (playerScore >=  400) {
            position = 3;
        }
         return position;
    }


    public static int  calculateScore(boolean gameOver ,int score, int levelCompleted, int bonus) {

        if(gameOver ) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=  2000;
            return finalScore;
        } else {
            return -1;
        }


    }
}
