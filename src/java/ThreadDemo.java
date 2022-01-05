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
                Thread.sleep(500);
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
}
