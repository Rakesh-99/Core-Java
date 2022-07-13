//Defining a Thread By extending Thread class !

class MyThread extends Thread 
{

    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Child Thread !");
        }
    }
}
public class DefiningThread1
{
    public static void main(String[] args)
    {
        MyThread obj = new MyThread();
        obj.start();
        

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Main Thread !");
        }
    }
}