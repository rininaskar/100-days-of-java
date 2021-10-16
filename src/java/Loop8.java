public class Loop8 {

    public static void main(String[] args) {

          int count = 6;
              while (count != 6) {
                  System.out.println("Count value is " + count);
                  count++;
              }

             for (int i=6; i!= 6; i++) {
                 System.out.println("Count value is " + count);
              }

             count = 1;
              while(true) {
                  if(count == 6) {
                    break;
                  }
                  System.out.println("Count value is " + count);
                  count++;
              }

        //          count = 6;
        //          do {
        //              System.out.println("Count value was " + count);
        //              count++;
        //          } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }
     public static boolean isEvenNumber(int number) {
        if ((number % 2)  == 0) {
            return true;
        } else {
            return false;
        }
     }

}
