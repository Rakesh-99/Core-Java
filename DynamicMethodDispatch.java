// What is Dynamic Method Dispathc ? 


/*
Method overriding is one of the ways in which Java supports Runtime Polymorphism. Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.

When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses) of that method is to be executed based upon the type of the object being referred to at the time the call occurs. Thus, this determination is made at run time.

At run-time, it depends on the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed


A superclass reference variable can refer to a subclass object. This is also known as upcasting. Java uses this fact to resolve calls to overridden methods at run time.

*/



class Teachers 
{
    public void eat()
    {
        System.out.println("Teachers are eating !!!");
    }

    public void teach()
    {
        System.out.println("Teachers teach!!!");
    }
}
class Students extends Teachers
{
    public void eat ()
    {
        System.out.println("Students are eating !!!");
    }

    public void study()
    {
        System.out.println("Students learn from Teachers !!!");
    }
}
public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
       
        Teachers obj = new Students();
        obj.eat();

    }
}