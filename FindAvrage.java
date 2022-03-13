// Find the Sum of three given numbers 


class Computer
{
    int sum;
    public void calculate(int a, int b, int c)
    {
        sum = a + b + c;
        System.out.println(sum);

    };

    public void avg()
    {
        int avg = sum / 3;
        System.out.println(avg);
    };
}
public class FindAvrage
{
    public static void main(String args[])
    {

        Computer obj1 = new Computer();
        obj1.calculate(10, 20, 5);
        obj1.avg();

    };
};