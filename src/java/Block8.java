public class Block8 {

    public static void main(String[] args) {


        calculateScore( true, 800, 5, 100);

        calculateScore(true, 10000, 10, 200);

    }

    public static void  calculateScore(boolean gameOver ,int score, int levelCompleted, int bonus) {

        if(gameOver ) {
            int  finalScore = score + (levelCompleted * bonus);
            finalScore += 2500;
            System.out.println("Your final score was " + finalScore);
        }


    }
}
