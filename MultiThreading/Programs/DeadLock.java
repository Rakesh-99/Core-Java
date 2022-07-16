// Example of DeadLock

/* 
 In this examole both of the Threads call join(); method and waiting for each other .. in this case program will get stucked and 
we will not get any output. This concept is called as DeadLock
*/


class MyRunnable implements Runnable
{
    public static Thread tObject;

    public void run()
    {
        try
        {
            tObject.join();
        }
        catch(InterruptedException ie)
        {

        }

        for(int i = 0; i < 10; i ++)
        {
            System.out.println("Child Thread !");
        }
    }
}
public class DeadLock
{
    public static void main(String[] args) throws InterruptedException
    {
        MyRunnable.tObject = Thread.currentThread();
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
        t.join();

        for(int i = 0 ; i < 10; i++)
        {
            System.out.println("Main Thread !");
        }
    }
}