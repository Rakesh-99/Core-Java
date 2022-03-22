// So what is super keyWord and why do i use it ? 


/*

So basically super keyWord is used in inheritance concept, We use super keyWord to call the particular constructor of parent class. 

So what do i mean by calling a particular constructor ? 

In the below example what happens is when i call the default constructor it calls the Default constructor of both class however, what if i want to call the parameterized constructor insted of default ?

yes you are right, we have to pass an argument while creating the object of B right? But hold on In that case we will get the output as "In int B" and "In A" right? 

but that was not the expected output what we have assumed before, right ?

So what we want is it should call the parameterized constructor of A  and as well as B .

So this is why Super keyWord comes into the picture. So what happens is when you call the constructor by default super() keyWord is called , So u have to define wheather you want parameterized constructor or default one. This is where u use super() keyword

*/
class A {

    public A() {
        System.out.println("In A");
    }
    public A(int k)
    {
        System.out.println("In A int");
    }
}
class B extends A
{
    public B()
    {     
        System.out.println("In B");
    }
    public B(int k)
    {
        super(k);
        System.out.println("In B Int");
    }
}
public class SuperKeyWord
{
    public static void main(String[] args)
    {
        B obj = new B(1);    
    }
}