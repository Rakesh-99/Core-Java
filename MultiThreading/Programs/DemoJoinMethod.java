
// Waiting of main thread until completing child thread 

class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Child Thread !");

            try
            {
            Thread.sleep(500);
            }
            catch(InterruptedException ie)
            {

            }
        
        }
        
    }
}
public class DemoJoinMethod
{
    public static void main(String[] args) throws InterruptedException
    {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
        t.join();
        


        for(int i = 0 ; i < 10; i ++)
        {
            System.out.println("Main Thread !");
            
        }
    }
}