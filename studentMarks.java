// Class and object 

class Student
{
	byte mark1;
	byte mark2;
	int res;
	
	public void add()
	{
		res = mark1+mark2;
	}
}

public class studentMarks
{
	public static void main(String[] args)
	{
		
		Student obj = new Student();
		obj.mark1 = 60;
		obj.mark2 = 70;
		obj.add();
		System.out.println(obj.res);
		
	}
}