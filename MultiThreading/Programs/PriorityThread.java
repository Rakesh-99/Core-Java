public class PriorityThread 
{
    public static void main(String[] args) 
     {
         System.out.println(Thread.currentThread().getPriority()); // Fetching the priority of main Thread which we'll get 5 by default


         Thread.currentThread().setPriority(10); // Setting the priority of a Main Thread from 5 to 10 
        
        System.out.println(Thread.currentThread().getPriority()); // Now th priority of main Thread is 5
        
    }    
}
