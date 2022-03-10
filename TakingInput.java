//How to take input from users ?

import java.util.Scanner;



public class TakingInput {
	
	
	public static void main(String args[]) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the second Number");
		int num2 = scan2.nextInt();
		
		
		int num3 = num1+num2;
		
		System.out.println("The sum of two numbers is "+num3);
		
		
		
		
		
		
		
		
	}

}
