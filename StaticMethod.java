class Computer
{
    public void m1()
    {
        System.out.println("Method 1");
    }
    public void m2()
    {
        System.out.println("Method 2");
        
    }
}

public class StaticMethod

{
    public static void main(String args[]) {

        Computer c1 = new Computer();
        c1.m1();
       

        
    }
}
