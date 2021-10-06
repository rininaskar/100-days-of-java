import java.util.Locale;

public class Control5 {

    public static void main(String[] args) {

        char charValue = 'G';
        switch (charValue) {
            case 'A' :
                System.out.println("A was found");
                break;
            case 'B' :
                System.out.println("B was found");
                break;
            case 'C' : case 'D' : case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

        String month = "JuNE";
        switch(month.toUpperCase()) {
            case "":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
