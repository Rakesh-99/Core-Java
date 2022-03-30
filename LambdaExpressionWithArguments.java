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

/*

Lambda expression is a new and important feature of Java which was included in Java SE 8. It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library. It helps to iterate, filter and extract data from collection.

The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

Java lambda expression is treated as a function, so compiler does not create .class file.

*/



// Why use Lambda Expression ? 


/*

1. To provide the implementation of Functional interface.
2. Less coding.

*/




// Java lambda expression is consisted of three components : 

/*

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.

*/


















interface Student
{
    public abstract void show();
}


public class LambdaExpressionWithArguments 
{
    public static void main(String[] args)
    {

        Student obj = () -> System.out.println("Example of Lambda Expression !!");
        obj.show();
    }
}