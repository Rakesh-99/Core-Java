
/* 
If a Thread calls join(); method on the same Thread it's self then the program will be stucked for infinity time this situation is called
as DeadLock. 

*/



public class DeadLockDemo2
{
    public static void main(String[] args) throws InterruptedException
    {

    Thread.currentThread().join();    
    }
}