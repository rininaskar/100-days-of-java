public class Example3 {

    public static void main(String[] args) {

        int score = 200;

        if (score >= 3000) {
            System.out.println("Your score was >= to 5000 ");
        } else if (score < 1000 && score >= 500) {
            System.out.println("Your score was < 1000 but >= 500");
        } else {
            System.out.println("Your score was < 500");
        }
    }
}
