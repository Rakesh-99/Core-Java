//what is this KeyWord and What is the use of it ?


/*
    
"this" is a keyWord in Java, it refers to the current directory.Conflict occures when the instance and local variables having same name. With the help of "this" keyWord we can get rid of this conflicts. 

*/



class Student 
{

    // Instance Variables 
    int mark1;
    int mark2;
     

    public Student(int mark1, int mark2)   // Local variables 
    {
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
}
public class This
{
    public static void main(String args[])
    {


        Student obj = new Student(90, 87);
        System.out.println(obj.mark1);


    }
}