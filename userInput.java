import java.util.Scanner;

public class userInput {



    public static void main(String[] args) {
        
        //Talking input from the user
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the first number !");
        int num1 = scan1.nextInt();
       



        
       


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter The Second number !");
        int num2 = scan2.nextInt();
        
       


        int sum = num1 + num2;
        
        System.out.println("The Sum of thwo numbers is " + sum);



    }
    
}
