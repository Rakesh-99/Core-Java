
// Overloading of a run(); method ;

/* 

Overloading of run(); method is possible however start(); method can only be used with no-arg run(); method. argument run(int i); method
we have to call it manually and it will be executed just as normal method executes . 

 */

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Run method !");
    }

    public void run(int i )
    {
        System.out.println(i);
    }
}
public class OverloadingOfRunMethod
{
    public static void main(String[] args)
    {

        MyThread obj = new MyThread();
        obj.start();
        obj.run(10);
    }
}