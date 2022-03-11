// What is Method overLoading ?

// The same name methods with diffrent Parameters and diffrent data types is called method Overloading 


// ex- 

class Computer
{
    public void specs(String processor, String gen, int core )
    {
        System.out.println(processor + " " + gen + " " + core);
    }

    public void specs(String ram, int memory, String brand)
    {
        System.out.println(ram + " "+ memory + " " + brand);
    }
}
public class MethodOverLoading
{
    public static void main(String args[])
    {

        Computer obj = new Computer();
        obj.specs("i3", "10th", 4);
        obj.specs("1Tb", 8, "Lenevo");
    }
}