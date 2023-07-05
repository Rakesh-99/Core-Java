// What is Abstarction ?

/*

Abstraction is a process of hiding unnecessary details(Implementation)from the users to focus on essential details(functionalities).It increases the efficiency and thus reduces complexity.

*/

// An abstract class can have normal method however a non-abstarct class can not have an abstarct method 


/*

When you extend an abstarct class ,you have to define it's all method body in class which extends abstract class otherwise it will through an compile time error.

*/

// You can not create the object of Abstract class however you can create the reference.



abstract class Universities {

    int total_no_of_universities;

    abstract void disp();
}

class Bhubaneswar extends Universities
{
    int total_no_of_univercities = 39;

    public void disp()
    {
        System.out.println(total_no_of_universities);
    }
}
class Kolkata extends Univercities
{
    int total_no_of_universities = 32;

    public void disp()
    {
        System.out.println(total_no_of_universities);
    }
}

public class Abstraction 
{
    public static void main(String[] args)
    {
        Bhubaneswar obj1 = new Bhubaneswar();
        obj1.disp();
        Kolkata obj2 = new Kolkata();
        obj2.disp();

    }
}