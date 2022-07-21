//Synchronized class level lock



class Display 
{
    public void wish(String name)
    {
        // 1 lack lines of code 

    synchronized(Display.class)
    {
        for(int i = 0; i < 10; i ++)
        {
            System.out.print("Good Morning :");

            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ie)
            {

            }
            System.out.println(name);
         }
        }
    }
}
class MyThread extends Thread
{
    Display d;
    String name;

    MyThread(Display d, String name)
    {
        this.d = d;
        this.name = name;
    }

    public void run()
    {
        d.wish(name);
    }
}
public class SynchronizedClassLevelLock
{
    public static void main(String[] args)
    {
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1, "Rakesh");
        MyThread t2 = new MyThread(d2, "Bikash");
        t1.start();
        t2.start();
    }
}