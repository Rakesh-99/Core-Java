//Synchronized current object level lock



class Display 
{
    public void wish(String name)
    {
        // 1 lack lines of codes
    synchronized(this)
    {
        for(int i = 0; i < 10; i++)
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

        // 1 lack lines of codes
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
public class CurrentObjectSynchronizedBlock
{
    public static void main(String[] args)
    {
        Display obj = new Display();
        MyThread t1 = new MyThread(obj, "Rakesh ");
        MyThread t2 = new MyThread(obj, "Bikash");
        t1.start();
        t2.start();
    }
}