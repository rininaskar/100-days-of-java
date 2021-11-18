import java.util.Scanner;

public class Prime2 {

    public static void main(String[] args) {

     int n1,n2,i,j,count;
        System.out.println("Enter the lower limit");
        Scanner sc= new Scanner(System.in);
        n1= sc.nextInt();
        System.out.println("Enter the upper limit");
        n2 = sc.nextInt();
        System.out.println("The prime nos are:");
        for (i=n1;i<=n2;i++)
        {
            count=1;
            for (j=2;j<=i;j++)
            {
                if (i%j == 0)
                    count++;
            }
             if(count == 2)
                 System.out.println(i);
        }

    }
}
