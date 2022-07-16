
public class GettingNdSettingNameOfThread 
{
    public static void main(String[] args) 
  {
      System.out.println(Thread.currentThread().getName()); // Getting the Thread name  output: main 

      Thread.currentThread().setName("Main Thread by Rakesh Kumar Parida"); //Setting the name of the Thread 

      System.out.println(Thread.currentThread().getName()); // after changing the main Thread name

     
    
 }   
}
