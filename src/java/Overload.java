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
        static int area(int s)
        {
            return (s*s);
        }
        static double area(double base, double height)
        {
            return (0.5*base*height);
        }
        public static void main (String[]args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius of ");
            double r = sc.nextDouble();
            System.out.println("Area of circle is:" +area(r));

            System.out.println("Enter the l and b of a rectangle:" );
            int l = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Area of rectangle is:" +area(l,b));

            System.out.println("Enter the sides of a square:");
            int s = sc.nextInt();
            System.out.println("Area of square is:" +area(s));

            System.out.println("Enter the base and height of a triangle:");
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            System.out.println("Area of triangle is:" +area(base,height));

        }
    }
}
