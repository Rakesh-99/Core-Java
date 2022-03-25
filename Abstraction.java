// What is Abstarction ?

/*

Abstraction is a process of hiding unnecessary details(Implementation)from the users to focous on essential details(functionalities).It increses the efficiency and thus reduces complexity.

*/

// An abstarct class can have normal method however a non-abstarct class can not have an abstarct method 


/*

When you extend an abstarct class ,you have to define it's all method body in class which extends abstarct class otherwise it will through an compile time error.

*/

// You can not create the object of Abstarct class however you can create the reference.



abstract class Univercities {

    int total_no_of_univercities;

    abstract void disp();
}

class Bhubaneswar extends Univercities
{
    int total_no_of_univercities = 39;

    public void disp()
    {
        System.out.println(total_no_of_univercities);
    }
}
class Kolkata extends Univercities
{
    int total_no_of_univercities = 32;

    public void disp()
    {
        System.out.println(total_no_of_univercities);
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