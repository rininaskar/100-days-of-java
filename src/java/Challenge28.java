import java.util.Scanner;

public class Challenge28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while (true) {

            System.out.println("Enter number");
            boolean isAntInt = scanner.hasNextInt();

            if (isAntInt) {
                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min=" + min + "max=" + max);
        scanner.close();
    }
}
