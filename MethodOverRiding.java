// How we can achive Method OverRiding ?

// We can achive Method overRiding by Declaring Two or more method with Same name with same parameters or same data types or same sequence in  diffrent class  and last inheritance concept must be there .


class A 
{
    public void show(int a)
    {
        System.out.println("Show method in A class !");
    }

    public void disp()
    {
        System.out.println("disp A");
    }

    
}
class B extends A
{
    public void show(int a)
    {

        System.out.println("Show method in B class");
    }
    
    public void disp() 
    {
        System.out.println("disp B");
    }
   
}
public class MethodOverRiding
{
    
   public static void main(String[] args)
    {

        B obj = new B();
        obj.disp();
    }
}