// Static block 

/*
1. Static block is executed at the class loading, hence at the time of class loading if we want to perform any activity, we have to define that inside static block.

2. We can also write multiple static method and it will be executed from to bottom.

3. We can run static block program without even declaring Main method but, it is only supported below 1.6 jdk version. Above 1.6 JDK version you can not run.

4. We use Static block To load the natives method at class execution time .

5. We also use the static block to initilized static members.

*/



public class StaticBlock
{


               static int a;

    static
    {
        System.out.println("Static block 1 !");
        a = 20;                 // Initializing static members 
    }

    static
    {
        System.out.println("Static block 2 !");
    }
    public static void main(String args[])
    {

        System.out.println(" Main Method!");
        System.out.println(a);
    }
}