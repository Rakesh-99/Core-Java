// Example of Constructor 

class A 
{
    int i;

    public A()
    {
        System.out.println("Default Construcotr !");
    }

    public A(int k)
    {
        System.out.println("Constructor OverLoading ! " + k);
    }
}

public class Constructor
{
    public static void main(String[] args)
    {

        A obj = new A();
        A obj2 = new A(20);

       
    }
}