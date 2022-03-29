// What is Interface ? 

/*
- Interface is a mechanism to achive abstraction in Java.
- Interface is similar to abstract class but having all the methods abstract type i.e. it can not have a method body.
-Since Java 8, We can have default and static method in an interface.
-Since Java 9, we can have private methods in an interface .

/*



// Why use Interface 

/*
- It is used to achive abstraction 
-By interface, we can support the functionality of multiple Inheritance.
-it can be used to achive loose coupling 

*/





interface EOne {

    public int numOne = 10;

    public abstract void show();

    default void run()
    {
        System.out.println("Default meth.. in EOne Interface!");
    }
}
interface ETwo
{
    public int numTwo = 5;

    public abstract void disp();

    default void outcome()
    {
        System.out.println("Default meth.. in ETwo Interface!");
    }

}
class Component implements EOne, ETwo
{
    public void show()
    {
        System.out.println("Component class implements EOne interface !"+ " " + numOne);
    }
    
    public void disp()
    {
        System.out.println("Component class implements ETwo interface !"+ " " + numTwo);
    }
}
public class Interface
{
    public static void main(String[] args)
    {
        Component obj = new Component();
        obj.show();
        obj.disp();
        obj.run();
        obj.outcome();
    }
}