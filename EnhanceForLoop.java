// What is foreach in Java? 


/*

The Java for-each loop or enhanced for loop is introduced since J2SE 5.0. It provides an alternative approach to traverse the array or collection in Java.

Advantages : It makes the code more readable. It eliminates the possibility of programming errors.

*/


public class EnhanceForLoop 
 {
     public static void main(String args[]) {

        
         int oneDArray[] = { 1, 3, 6, 9, 2 };

         for(int i : oneDArray)
         {
             System.out.println(i);
         }







         System.out.println("How to itrate an multiple dimensional array using for each loop , let's see !");

         int twoDArray[][] = 
         {
             {1,5,4,2,9,1},
             {4,3,2,9,1},
             {2,3},
             {9,1,3}
        };
        
        for(int k[] : twoDArray)
        {
            for(int l : k)
            {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }

}