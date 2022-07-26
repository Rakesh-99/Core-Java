

class A 
{
    public synchronized void display1(B obj2)
    {
        System.out.println("Thread-1 starts execution");

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {

        }
        System.out.println("Thread-1 calls b's last() method !");
        obj2.last();
    }
    
    public synchronized void last()
    {
        System.out.println("Thread-1 last() method !");
    }
    
}
class B 
{
    public synchronized void display2(A obj1)
    {
        System.out.println("Thread-2 starts execution !");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {

        }
        System.out.println("Thread-2 calls A's last() method !");
        obj1.last();
    }

    public synchronized void last()
    {
        System.out.println("Thread-2 last() method !");
    }
}

class MyThread extends Thread
{
    A obj1 = new A();
    B obj2 = new B();

    public void m1()
    {
        this.start();
        obj1.display1(obj2);
    }

    public void run()
    {
        obj2.display2(obj1);
    }
}

public class DeadLockDemo3
{
    public static void main(String[] args)
    {
        MyThread mt = new MyThread();
        mt.m1();
    }
}