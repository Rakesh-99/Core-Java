// What is Wrapper class  ? 

/*
- The conversion of premitive data types into object is know as Wrapper class, In other words we wrap the premitive data type into an object .
*/


// What is AutoBoxing and AutoUnBoxing ? 


/*
-Since J2SE 5.0,autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.
*/



// Why do we need Wrapper class ? 


/*
-Java is an object-oriented language and can view everything as an object.A simple file can be treated as an object,an address of a system can be seen as an object,an image can be treated as an object(with java.awt.Image)and a simple data type can be converted into an object(with wrapper classes).This tutorial discusses wrapper classes.Wrapper classes are used to convert any data type into an object.
*/


/*
-The primitive data types are not objects;they do not belong to any class;they are defined in the language itself.Sometimes,it is required to convert data types into objects in Java language.For example,upto JDK1.4,the data structures accept only objects to store.A data type is to be converted into an object and then added to a Stack or Vector etc.For this conversion,the designers introduced wrapper classes.
*/


/*
Primitive Type       	Wrapper class
boolean                 	Boolean
char	                    Character
byte	                    Byte
short	                    Short
int	                        Integer
long	                    Long
float	                    Float
double	                    Double
*/





public class WrapperClass
{
    public static void main(String[] args)
    {


        // Boxing and UnBoxing 

        int i = 1; // Premetive Data type
        
        Integer j = new Integer(i); // Boxing or  Wrapping premetive data type to an Object 

        int k = j.intValue(); // UnBoxing or UnWrapping the value
        
        System.out.println(k);


        // AutoBoxing or AutoUnBoxing 


        int s = 2;

        Integer q = s; // AutoBoxing or AutoWrapping will be done by Compiler

        int x = q; // AutoUnboxing or AutoUnwrapping done by Compiler 
        
        System.out.println(x);



    



    }
}