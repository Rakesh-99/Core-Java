// - Whenever last daemon thread terminates autometically all daemon thread will be terminated irrespective of their position.




class MyThread extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i ++)
        {
            System.out.println("Child Thread !");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {

            }
        }
    }
}
public class DaemonThreadDemo
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();

        System.out.println("End of main Thread !");
    }
}