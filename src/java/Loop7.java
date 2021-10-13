public class Loop7 {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i=6; i!= 6; i++) {
            System.out.println("Count value is " + count);
        }

  //      count = 1;
  //      while(true) {
  //          if(count == 6) {
  //              break;
  //          }
  //          System.out.println("Count value is " + count);
  //          count++;
  //      }
    }
}
