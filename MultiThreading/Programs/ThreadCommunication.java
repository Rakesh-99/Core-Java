// Communication between two Threads 





public class ThreadCommunication
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread mt = new MyThread();
        mt.start();
        

        System.out.println("Main Thread calling wait() method !");

        synchronized(mt)
        {
            System.out.println("Main Thread goes to waiting state !");
            mt.wait();
        }

        System.out.println("Main thread get notified !");

        System.out.println(mt.total);
        
    }
}

class MyThread extends Thread
{
    int total = 0;

    public void run()
    {
        synchronized(this)
        {
            System.out.println("Child Thread starts calculation !");
        
            for(int i = 0; i < 10; i++)
            {
                total = (total + i);    
            }
            System.out.println("Child Thread notifying main Thread !");
            this.notify();
        }
    }
}