import java.util.Scanner;

public class Gcd_Lcm {

    static int gcd(int x, int y)
    {
        int r = 0,a,b;
        a = (x>y) ? x:y;
        b = (x<y) ? x:y;
        r=b;
        while (a%b!=0)
        {
            r = a%b;
            a=b;
            b=r;
        }
        return r;
    }

    static int lcm(int x, int y)
    {
        int a,i;
        a=(x>y)?x:y;
        for(i=a;i<=x*y;i=i+a)
        {
            if(i%x == 0 && i%y == 0)
                break;
        }
        return i;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("The GCD of two numbers:"  +gcd(x,y));
        System.out.println("The LCM of two numbers:" );
    }
}
