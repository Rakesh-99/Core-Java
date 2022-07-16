class MyThread extends Thread
{
    super.start();
    public void start()
    {
        System.out.println("Start method !");
    }

    public void run()
    {
        System.out.println("run method !");
    }
}
public class Super_start
{
    public static void main(String[] args)
    {
       
        MyThread obj = new MyThread();
        obj.start();

        System.out.println("Main Method !");
    }
}