import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        int n,length = 0,temp1,b,temp2,sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("\n Enter any integer you want to check:");
        n = s.nextInt();
        temp1 = n;
        temp2 = n;
        while (temp1 > 0)
        {
            temp1 = temp1 / 10;
            length++;
        }
        while (n > 0)
        {
            b = n % 10;
            sum = (int) (sum + Math.pow(b,length));
            n = n / 10;
        }
        if(sum == temp2)
        {
            System.out.println("Given number is Armstrong");
        }
        else
        {
            System.out.println("Given number is not Armstrong");
        }
    }
}
