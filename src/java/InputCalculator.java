import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner=new Scanner(System.in);
        int number,sum=0;
        double avg=0;
        double count=0;
        while(true) {

            boolean isnextint=scanner.hasNextInt();
            if(isnextint) {
                number=scanner.nextInt();
                count++;
                sum +=number;
                avg=sum/count;
            } else {
                System.out.println("SUM = "+sum+" AVG = "+((long)Math.round(avg)));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}

