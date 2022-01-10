class NewThread implements Runnable
{
    String name;
    Thread t;
    NewThread(String threadname)
    {
        name = threadname;
        t = new Thread(this,name);
        System.out.println("New thread:" +t);
        t.start();
    }
    public void run()
    {
        try
        {
            for (int i = 5; i>0; i--)
            {
                System.out.println(name+ ":" +i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting" + name + "thread");
    }
}
public class ThreadDemo {

    public static void main(String[] args) {

        new NewThread("one");
        new NewThread("two");
        new NewThread("three");
        try
        {
            for (int i=5; i>0; i--)
            {
                System.out.println("Main Thread:" +i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread interrupted.");
        }
        System.out.println("Main Thread exiting.");
    }
}
