import java.util.Scanner;


public class CommandLineArg extends RuntimeException
{
    public static void main(String[] args) throws MarkExceedException
    {
      

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the full mark");
        int mark = scan.nextInt();

        if(mark > 100)
        {
            throw new MarkExceedException("Marks can not be more than 100");
        }
        else
        {
            System.out.println("Your mark from 100 is  "+ mark);
        }
    }
}