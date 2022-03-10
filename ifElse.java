
// Check if the given number even or odd
import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check if it is even or odd ");
        int num = scan.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("The given " + num + " is even number");
        }
        else
        {
            System.out.println("The given " +num+ " is Odd number ");
        }
        



        
    }
    
}
