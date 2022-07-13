class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 10; i ++)
        {
            System.out.println("Child Thread !");
        }
        Thread.yield();
    }
}

public class DemoYeildMethod
{
    public static void main(String[] args) 
    {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();


        for(int i = 0 ; i < 10; i ++)
        {
            System.out.println("Main Thread !");
        }

    }
}