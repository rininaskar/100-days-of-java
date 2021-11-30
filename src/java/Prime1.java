import java.util.Scanner;

public class Prime1 {

    public static void main(String[] args) {

        int i,n,m,f;
        System.out.println("Enter the lower limit");
        Scanner sc= new Scanner(System.in);
        m = sc.nextInt();
        System.out.println("Enter the upper limit");
        n = sc.nextInt();
        System.out.println("The prime numbers are");
        for( i=m; i<=n; i++)
        {
            f=0;
            for(int j=1; j<=i; j++)
            {
                if (i%j==0)
                    f=f+1;
            }
            if(f==2)
                System.out.println(i);
        }
    }
}
