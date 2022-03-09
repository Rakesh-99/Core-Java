import java.util.Scanner;

public class switchStatements 
{
    public static void main(String[] args)
    {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day !");
        String day = scan.nextLine();

        switch(day)
        {
            case "Monday":
            {
                System.out.println("Today is Monday !");
            }
                break;
            case "Tuesday":
            {
                System.out.println("Today is Tuesday!");
            }
                break;
            case "Wedensday":
            {
                System.out.println("Today is Wedensday!");
            }
                break;
            case "Thursday":
            {
                System.out.println("Today is Thursday!");
            }
                break;
            default:
            {
                System.out.println("Non of Matched!");
            }
        }
    }
}