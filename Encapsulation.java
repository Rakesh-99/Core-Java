// What is Encapsulation ? 


/*
-Encapsulation in Java is a mechanism of wrapping the data(Variables)and perform some action on that data using public method together as a single unit.
*/



// Steps to achive Encapsulation 


/*
- First you will have to declare the data(variables) of private in a class.
-Provide the getter and setter method to modify and view the variables.
*/



// what is Data hiding ?


/*
In Encapsulation the variables of the class will be hidden from other classes, and can be accessed only through the methods of their current class. This concept is known as Data hiding .
*/


class Computer 
{
    private int memory;
    private String brand;


    // Getter Method 
    public void getComp1(int memory)
    {
        this.memory = memory;
        
    }

    public void getComp2(String brand)
    {
        this.brand = brand;
        
    }
    // Setter Method 

    public int setComp1()
    {
        return memory;

    }
    public String setComp2()
    {
        return brand;
    }

}
public class Encapsulation 
{
    public static void main(String[] args)
    {
        
        Computer obj = new Computer();
        obj.getComp1(12);
        System.out.println(obj.setComp1());

        obj.getComp2("Lenevo");
        System.out.println(obj.setComp2());
    }
}