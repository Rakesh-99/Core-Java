// What happend if we restart the Thread again after it started ? 

/* 

if we restart a Thread again after it has been started we will get the runtime Exception callled 
"java.lang.IllegalThreadStateException". 

*/


class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Child Thread !");
    }
}
public class RestartingThread
{
    public static void main(String[] args)
    {
        MyThread obj = new MyThread();
        obj.start();
        System.out.println("Main Thread !");

        obj.start();  // Restarting the Thread 

    }
}