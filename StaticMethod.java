// Static Method 



/*

1. Static method belongs to class not to Object
2. Static method helps in memory management as we don't need to crete objects to call the method .
3. you can call the static method within the class by only writing method name.
4. if you are calling it from outside of current class you will have to call the class with method name. 
5. Static method can not refer to "this" or "super" keyWord anyway
6.A static method can only call static method and can not call non-static method 
7.Static method can access only static data and can not access non=static data(Instance data)

*/

class Computer
{
    public static void show()
    {
        System.out.println("Hey There !");
    }
}

public class StaticMethod
{

    public static  void m1()
    {
        System.out.println("Method1");
    }

    public void m2()
    {
        System.out.println("Method 2");
    }


    public static void main(String args[])
    {



        m1();              // here this static method is written with in the class so we can call the method by writing m1();
        Computer.show();      //calling a static method show(); outside of class with class name Computer 

    }
}