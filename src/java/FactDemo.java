public class FactDemo {

    public static void main(String[] args) {

        int n;
        if(args.length == 0)
            System.out.println("No command line argument");
        for (int i = 0; i< args.length;i++)
        {
            n=Integer.parseInt(args[i]);
            int f = 1;
        for (int j = n; j>=1; j--) {
            f=f*j;
        }
            System.out.println("The factorial of" + n + "in" + f);
        }
    }
}
