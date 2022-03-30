class Students
{
    public void show()
    {
        System.out.println("Outer class 'show' method !!");
    }
}
public class AnonymousInnerClass
{
    public static void main(String[] args)
    {

        Students obj = new Students()
        {
            public void show()
            {
                System.out.println(" Ex. of Anonyous inner class !!");
            }
        };

        obj.show();
      
    }
}