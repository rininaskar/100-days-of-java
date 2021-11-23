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
    }
}
