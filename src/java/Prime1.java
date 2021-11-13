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
        for(int j=m; j<=n; j++)
        {
            f=0;
            for(i=2; i<j-1; i--)
            {
                if (j%i==0)
                    f=1;
            }
            if(f==0)
                System.out.println(j);
        }
    }
}
