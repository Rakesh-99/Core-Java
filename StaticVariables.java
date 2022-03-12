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


