// What is inner class and why do we use it ?


/*
1. Creating a class inside another class is called Inner Class 
2. We can not directly call the Inner clas, we will have to call it with parent class name.
3. A class can have multiple Inner Class.
4.To create an object of Inner class we will have to call it with the reference of parent class .

/*


// Why do we need to use Inner Class ? 


/*
We use inner classes to logically group classes and Interface in one place to be more readable and maintainable.Additionally it can accss all the members of outer class, Including private data members and methods 

*/



class Outer
{
    int age = 23;
    String name = "Rakesh";

    public void display()
    {
        System.out.println("In Outer class :" + age + " " + name);
    }
    
    class Inner
    {
        int age = 26;
        String name = "Nabaranjan";

        public void show()
        {
            System.out.println("In Inner class : "+ age + " "+name);
        }
    }
}

public class InnerClass
{
    public static void main(String args[])
    {
        Outer obj1 = new Outer();
        obj1.display();
        Outer.Inner obj2 = obj1.new Inner();
        obj2.show();

    }
}