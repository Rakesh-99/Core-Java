// What if we dont override the run(); method ?

/* 
if we are not overriding run(); method then Thread class run(); method will be executed, which has empty implementation, hence we will not
get any output. It is highly recommended to override run(); method otherwise don't go for Multithreading concept.
*/


class MyThread extends Thread
{

}
public class NotOverRidingRunMethod
{
    public static void main(String[] args) 
    {
        
        MyThread obj = new MyThread();
        obj.start();
    }
}