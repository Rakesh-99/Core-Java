import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many values you want to store in an Array ?");
        int num = scan.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the values in Array !");

        for(int i =0 ; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}