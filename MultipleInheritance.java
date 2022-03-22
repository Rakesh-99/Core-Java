class A 
{
    public void run()
    {
        System.out.println("In A class");
    }
}

class B extends A {
    public void run() {
        System.out.println("In B class");
    }
}
class C extends B
{

}
public class MultipleInheritance
{
    public static void main(String[] args)
    {
        
        C obj = new C();
        obj.run();
    }
}