// How we can achive Method Overloading ?

// We can achive Method overloading by Declaring Two or more method with Same name with diffrent parameters or diffrent data types or diffrent sequence in one class .


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