import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        int a[],i,j,n;
        try
        {
            System.out.println("Enter the no of elements:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            a = new int[5];
            System.out.println("Enter the elements");
            for(i=0;i<n; i++)
                a[i] = sc.nextInt();

            for (i=0;i<n;i++){
                for (j=0;j<n-i-1;j++){
                    if(a[j] > a[j+1]){
                        int t = a[j];
                        a[j] = a[j+1];
                        a[j+1] = t;
                    }
                }
            }
            System.out.println("The sorted array in ascending order:");
            for (i=0;i<n;i++)
                System.out.println(a[i] + "   ");
            System.out.println("The sorted array in descending order:");
            for (i=n-1;i>=0;i--)
                System.out.println(a[i] + "   ");
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("Check no of elements");
        }
        catch (InputMismatchException e) {
            System.out.println("Check the input");
        }
    }
}
