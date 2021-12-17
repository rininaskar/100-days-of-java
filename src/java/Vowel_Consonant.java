import java.util.Scanner;

public class Vowel_Consonant {

    public static void main(String[] args) {

        char n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        n = sc.next().charAt(0);
        switch (n)
        {
            case 'a':
            case 'A':

            case 'e':
            case 'E':

            case 'i':
            case 'I':

            case 'o':
            case 'O':

            case 'u':
            case 'U':
                System.out.println("The given character" + n + "is a vowel");
        }
    }
}
