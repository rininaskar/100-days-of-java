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
        System.out.println("\n lastindexOf('c')=" +str.lastIndexOf('c'));
        String str2 = "Java Programming";
        System.out.println("\n Java Programming-indexOf(P)=" +str2.indexOf('P'));
        System.out.println("\n replace=" +str.repeat('I'));
        str1 = str.concat("WELCOME");
        System.out.println("\n after Concatination:" +str1);
        str1= "        hello bca";
        System.out.println("\n After trim():" +str1.trim());
        char ch[];
        ch= st3.toCharArray();
        for (int i=0;i<ch.length;i++)
            System.out.println(ch[i]);
    }
}
