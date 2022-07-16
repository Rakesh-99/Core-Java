// Example of sleep(); method  :



public class MethodSleepDemo
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i ++)
        {
            System.out.println("Slide- " + i);

            try
             {
            Thread.sleep(1000);
             }
            catch(InterruptedException ie)
             {
            
             }
        }
        
    }
}