// Overriding of start(); Method !

/* 
If we Override start(); method then our start(); method will be executed just as like normal method and new Thread won't be created,
so it is highly recommended to not override the start(); method otherwise don't go for MultiThreading concept.
*/



class MyThreadDemo extends Thread
{

    public void start()
    {
    System.out.println("Start Method !");
    }

    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Child Method !");
        }
    }
}
public class OverridingStartMethod
{
    public static void main(String[] args)
    {

        MyThreadDemo obj = new MyThreadDemo();
        obj.start();

        for(int i = 0; i < 10; i++)
        {
            System.out.println("Main Method !");
        }
    }
}