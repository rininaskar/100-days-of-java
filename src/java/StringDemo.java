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
    }
}
