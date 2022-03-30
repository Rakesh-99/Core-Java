// What is Anonymous Inner Class ? 

/*
- Java anonymous inner class is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain "extras" such as overloading methods of a class or interface, without having to actually subclass a class.


- In simple words, a class that has no name is known as an anonymous inner class in Java. It should be used if you have to override a method of class or interface. Java Anonymous inner class can be created in two ways:


            1. Class (may be abstract or concrete).
            
            2. Interface
*/


        // What is the main purpose of using Anonymous Inner Class ?


        // - The main purpose of Anonymous inner class is to just for instatnce use or one time usage .



        // example : - 

        
class Students
{
    public void show()
    {
        System.out.println("Outer class 'show' method !!");
    }
}
public class AnonymousInnerClass
{
    public static void main(String[] args)
    {

        Students obj = new Students()
        {
            public void show()
            {
                System.out.println(" Ex. of Anonyous inner class !!");
            }
        };
        obj.show();


        Students obj2 = new Students();  // This is how we can call the parent class method by creating new object of it 
        obj2.show();
        
      
    }
}