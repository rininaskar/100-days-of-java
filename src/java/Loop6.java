public class Loop6 {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        //FOR LOOP BELOW IS NOT IDENTICAL TO WHILE LOOP ABOVE
        // for(int i=0; i<7; i++) {
        //    System.out.println("Count value is " + count);
       // }
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }
    }
}
