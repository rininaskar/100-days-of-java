public class Logical18 {

    public static void main(String[] args) {

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
