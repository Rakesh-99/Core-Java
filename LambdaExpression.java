interface Student
{
    public abstract void show();
}


public class LambdaExpression 
{
    public static void main(String[] args)
    {

        Student obj = () -> System.out.println("Example of Lambda Expression !!");
        obj.show();
    }
}