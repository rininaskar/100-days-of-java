import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int fib1=0,fib2=1,temp = 0,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the limit");
        num = sc.nextInt();
        System.out.print("  "+fib1);
        System.out.print("  "+fib2);
        for (int i=2;i<num;i++)
        {
            temp = fib1 + fib2;
            System.out.print("  "+temp);
            fib1 = fib2;
            fib2 = temp;
        }
    }
}
