// Defining Thread by implementing Runnable Interface 

class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Executing by Child Thread !");
        }
    }
}
public class DefiningThread2
{
    public static void main(String[] args)
    {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Executing by Main Thread !");
        }
    }
}