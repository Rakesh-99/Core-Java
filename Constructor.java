                                                // What is Constructor ? 


/*
  
1. Constructor is a member method of a Class which contains the same name as class name but with parantheses .It returns nothing so we dont write any return type.

2. You dont need to call the constructor, it is called autometically by the time we create objects for the class. 

3. The constructor without parameter is called default constructor and constructors with diffrent parameters is called constructor overloading .

*/

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

    public A(double d, String name)
    {
        System.out.println(d +" "+ name);
    }
}

public class Constructor
{
    public static void main(String[] args)
    {

        A obj = new A();
        A obj2 = new A(20);
        A obj3 = new A(3.0, "Rakesh");

       
    }
}