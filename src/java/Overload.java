import java.util.Scanner;

public class Overload
    {
        static double area ( double r)
        {
            return (3.14 * r * r);
        }
        static int area(int l, int b)
        {
            return (l*b);
        }
        public static void main (String[]args) {
        {
            double r;
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the radius of ");
                r = sc.nextDouble();
            }
            System.out.println("Area of circle is:" +area(r));
        }
    }
}
