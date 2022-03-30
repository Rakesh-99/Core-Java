// What is Lambda Expression ?  


/*
- The method which has no name and or methoddoesn't contain any name.
- Method should not carry return type.
- The method which doesn't contain Modifiers.

If above condition is matching we call it Lambda Expression
*/



// What is functional Interface ? 


// An interface which contains only one abstarct method is called Functional interface .



// example of noraml method : 


/*

public void run()

{  
 System.out.println("Code runs !!")
};

*/

// Converting the above normal method to lambda expression:


/*
() -> System.out.println("code runs");
*/

/*

- Lambda expression can contain any no. of arguments.
- For one argument paranthese are optional
- Defining the data type is optional (Compiler will autometicaly know the data type)

*/

interface Student
{
    public abstract void show();
}


public class LambdaExpression 
{
    public static void main(String[] args)
    {

        Student obj = () -> System.out.println("Example of Lambda Expression !!");
        obj.show();
    }
}