// what is final keyWord? 


/*
- if you declare final variable it can not be changed, In other word we can say it is constant 
- if you declare a method as final, methods can not be overridden 
- if you declare suoer class as final class, it means subclass can not accessed super class or super class can not be extended.
*/






final class Student {

    final int mark = 89; // This mark can not be changed cuz it is final,In other words it is constant

    public final void show() {
        System.out.println(mark++); //Compile time Error at line no 5: mark can not be changed cuz it is final
    }

}

class Teacher extends Student  // Error at line no.11 Final class can not be extended 
{
    public void show()      // Compile time Error at line no. 12 : Final method can not be overridden 
    {
        System.out.println("Hello !!!");
    }
}









public class FinalKeyWord
{
    public static void main(String[] args)
    {
        
    }
}