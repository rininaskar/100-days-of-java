public class Control3 {

    public static void main(String[] args) {

        char charValue = 'D';
        switch (charValue) {
            case 'A' :
                System.out.println("A was found");
                break;
            case 'B' :
                System.out.println("B was found");
                break;
            case 'C' : case 'D' : case 'E':
                System.out.println(charValue + "was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }
    }
}
