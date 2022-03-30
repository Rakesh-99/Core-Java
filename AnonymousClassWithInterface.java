// What is Anonymous Inner Class ? 

/*
- Java anonymous inner class is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain "extras" such as overloading methods of a class or interface, without having to actually subclass a class.


- In simple words, a class that has no name is known as an anonymous inner class in Java. It should be used if you have to override a method of class or interface. Java Anonymous inner class can be created in two ways:


            1. Class (may be abstract or concrete).
            
            2. Interface
*/

// What is the main purpose of using Anonymous Inner Class ?

// - The main purpose of Anonymous inner class is to just for instatnce use or one time usage .

// When we should go for top level class and when we should go for Anonymous inner class   

/*
    - If it is permanent or several times required we have to go for top level class and if it is required for one time or temporary we should go for anonymous inner class .

*/









// example of Anonymous inner class with interface 

interface Computer
{
    public abstract void run();
}


public class AnonymousClassWithInterface
{
    public static void main(String[] args)
    {

        Computer obj = new Computer()
        {
            public void run()
            {
                System.out.println("This computer Os is running on windows 11 !");
            }
        };

        obj.run();
    }
}