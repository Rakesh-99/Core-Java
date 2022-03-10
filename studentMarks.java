
// What is Class and object in Java ? 

/*

class - Class is the BluePrint of an Objects or it defines the structure of an object

object - An object can be anyting e.g A computer, Phone, Bike, Car etc.. An objects has two state 

	1. Object knows something- When I talk about object knows somthiong, that means I am talking about the data, the varibals the class contains .. 
	
	2. Object does something - Object does something with the help of methods 

	And these two states of object will be specified by the Class 


	*/

class Student
{
	byte mark1;
	byte mark2;				// Instance Variables 
	int res;
	
	public void add()
	{
		res = mark1+mark2;
	}
}

public class StudentMarks
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