/*

Why we should use static variables ?

a: Memory Management 


The static keyword in java is used for memory management mainly.We can apply java static keyword with variables,methods,blocks and nested class.The static keyword belongs to the
class not to Objects

The static can be:

variable (also known as class level variable) method (also known as class level method)


*/


class Students
{
    int rollNo;
    String name;
    String grade;
    static boolean IsDiplomaCompleted = true;


    public Students(int rollNo, String name, String grade)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;

    }

    public void display()
    {
        System.out.println(name + " "+ rollNo + " "+ grade + " " + IsDiplomaCompleted);
    }
}

class StaticVariables
{
    public static void main(String args[])
    {
        Students std1 = new Students(20, "Rakesh Kumar Parida", "B.Tech");
        Students std2 = new Students(2, "Rahul Sribastabb", "TechM");
        std1.display();
        std2.display();
    }
}


