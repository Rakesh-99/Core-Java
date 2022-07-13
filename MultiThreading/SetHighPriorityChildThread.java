class MyThread extends Thread
{
    public void run()
    {
        for(int i = 0 ; i < 10; i++)
        {
            System.out.println("Child Thread !");
        }
    }
}
public class SetHighPriorityChildThread 
{
    public static void main(String[] args) 
    {
    
        MyThread obj = new MyThread();
        obj.start();
        System.out.println(Thread.currentThread().getPriority()); // here Main Thread has 5 Priority 
        
        obj.setPriority(10); // giving the max priority to child Thread
        
        System.out.println(obj.getPriority());   // Getting the child Thread priority


        for(int i = 0 ; i < 10; i++)
        {
            System.out.println("Main Thread !");
        }


/* 
        So the output will be child Thread 10 times followed by Main Thread because we have given the high priority to Child Thread so
        therefore child Thread will be executed first .

        */
 }   

}