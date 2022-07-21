
class Person1
{
    public synchronized void display1(Person2 p2)
    {
        System.out.println("Thread 1 starts execution of display1() method !");

        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException ie)
        {

        }
        System.out.println("Person1 calls person2 last() method !");
        p2.last();
    }

    public synchronized void last()
    {
        System.out.println("Person1's last() method !");
    }
    
}
class Person2 
{
    public synchronized void display2(Person1 p1)
    {
        System.out.println("Person2 starts execution of display2() method !");

        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException ie)
        {

        }
        System.out.println("Person 2 calls person1 last() method !");
        p1.last();
    }
    public synchronized void last()
    {
        System.out.println("Person2 last() method !");
    }

}

class MyThread extends Thread
{
    Person1 p1 = new Person1();
    Person2 p2 = new Person2();

    public void m1()
    {
        this.start();
       p1.display1(p2);
    }

    public void run()
    {
        p2.display2(p1);
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