// Find the Sum of first N natural no..
import java.util.Scanner;

class Computer 
{
    int sum = 0;

   
    public void display()
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First N natural No. to find out the Sum !");
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++)
        {
            sum = (sum + i);
        }
        System.out.println(sum);
    }
}

public class NaturalNo
{
    public static void main(String args[])
    {

        Computer obj = new Computer();
        obj.display();
    }
}