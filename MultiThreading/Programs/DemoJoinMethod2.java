
// Witing of Child thread until completing main thread 



class MyRunnable implements Runnable
{
    public static Thread mt;

    public void run()
    {
        try
        {
            mt.join();
        }
        catch(InterruptedException ie)
        {

        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Child Thread !");
        }
    }
}
public class DemoJoinMethod2
{
    public static void main(String[] args) throws InterruptedException
    {
        MyRunnable.mt = Thread.currentThread();
        MyRunnable mr = new MyRunnable();
        Thread obj = new Thread(mr);
        obj.start();

        for (int i = 0; i < 10; i ++)
        {
            System.out.println("Main Thread !");
            Thread.sleep(500);
        } 
    }
}