class MyThread extends Thread
{

}


public class DaemonThread 
{
    public static void main(String[] args)
    {

        //System.out.println(Thread.currentThread().isDaemon()); //method to check if the thread is Daemon or not 

       // Thread.currentThread().setDaemon(true); // Method to set a Thread as daemon thread h

        

       MyThread t = new MyThread();
        t.setDaemon(true);
        System.out.println(t.isDaemon());
        t.start();
    }
}