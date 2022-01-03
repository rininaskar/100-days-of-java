import java.util.Scanner;

public class Overload
    {
        static double area ( double r)
        {
            return (3.14 * r * r);
        }



        public static void main (String[]args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius of ");
            double r = sc.nextDouble();
            System.out.println("Area of circle is:" +area(r));








        }
    }
}
