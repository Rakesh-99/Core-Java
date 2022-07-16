// This is How a Thread can interrupt another Thread : 


class MyRunnable implements Runnable
{
    public void run() 
    {
        try
            {
        for(int i = 0 ; i < 10; i ++)
        {
            System.out.println("I am Executing !");
            
            Thread.sleep(1000);
            
            
        }
            }
            catch(InterruptedException ie)
            {
                System.out.println("I got interrupted !");
            }
    }
}

public class InterruptingThread
{
    public static void main(String[] args)
    {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
        t.interrupt();


      
        System.out.println("End of Main Thread !");
        

    }
}