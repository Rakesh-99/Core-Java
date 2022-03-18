// Array 

public class Array {
    public static void main(String args[]) {

        System.out.println("Example of  One dimensional Array ");
        System.out.println();

        int arr[] = { 10, 20, 40, 15, 30 };

        System.out.println(arr[2]); // This is how we print the value of an arry

        arr[2] = 5; // This is how we change the value of an arry

        System.out.println(arr[2]); // this line of code will print 5 because we changed the value then print it

        System.out.println("This is how we itrate the array values using for loop ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Example of Two Dimensional Array !");
        System.out.println();

        int TwoDArr[][] = {
                { 1, 2, 3, 6, 8, 9 },
                { 9, 3, 4, 1, 2, 6 }

        };

        System.out.println("How to access them ? ");
        System.out.println(TwoDArr[0][2]); // first elements is for row and second for column Position ,In this e.g in
                                           // 0th pos it will access the first row of an array and "2" element position
                                           // will be targetted the first row of index no 2. So here we will get the
                                           // value 3 as the index position is 2.

        System.out.println("Itrating the Two dimensional array !");

        for (int i = 0; i < TwoDArr.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + TwoDArr[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Example of a jagged aray");

        // what is jagged array ?

        // Jagged arrays are also known as ragged arrays. They are the arrays containing
        // arrays of different length.

        
        	int jgdArr [][] = 
			{
					{1,2,39,11,20},
					{9,2,5,6,1},
					{1,2},
					{9,5,3,7}
			};
		
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < jgdArr[i].length; j++)
			{
				System.out.print(" " + jgdArr[i][j]);
			}
			System.out.println();
		
        }
    }

}