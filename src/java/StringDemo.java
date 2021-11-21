import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        String str,str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------------------\n");
        System.out.println("Enter a string \n");
        str = sc.nextLine(); //reads the string value from the user
        System.out.println("\n--------------------------\n");
        System.out.println("string length is: " +str.length());
        System.out.println("\n Upper Case= " +str.toUpperCase());
        System.out.println("\n Lower Case= " +str.toLowerCase());
        System.out.println("\n original string : " +str); //strings are immutable
        System.out.println(" Comparison with string");
        String st1 = "Rini";
        String st2 = "Rini";
        String st3 = "Naskar";
        System.out.println(st1.compareTo(st3));
        System.out.println(st3.compareTo(st1));

    }
}
