abstract class Univercities 
{
	int no_Of_students;
	
	abstract public void find();
}

class IIT extends Univercities 
{
	
	
	public IIT(int no_Of_students)
	{
		this.no_Of_students = no_Of_students;
	}
	
	public void find()
	{
		System.out.println(no_Of_students);
	}
}
class NIT extends Univercities
{
	public NIT(int no_Of_students)
	{
		this.no_Of_students = no_Of_students;
	}
	
	public void find()
	{
		System.out.println(no_Of_students);
	}
}

public class AbstractionExm2
{
	public static void main(String[] args)
	{
		IIT obj1 = new IIT(1200);
		obj1.find();
		NIT obj2 = new NIT(900);
		obj2.find();
	}
}