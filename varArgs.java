// what is VarArgs  ?

/*
1. varargs is a type of variable that is declared within a method's parameters. It stands for variable arguments. A method parameter declared as the varargs type can be passed a variable number of arguments, i.e. zero or more number of arguments.


2. A varargs parameter can only be declared within a method's parameters.

3.   A varargs parameter is declared by specifying -

                      type of varargs parameter, followed by
                    Three dots(...), followed by
                    Name of the varargs parameter.

4. For example - let u s declare a method, add(), that takes a varargs argument of type int in its parameters, which means that this method can be passed zero or more number of arguments of type int.
*/

class Computer
{
    public int add(int ...a)
    {
        int sum = 0;

        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }

    public void disp(String str, int ...c)
    {
        System.out.print(str + " ");

        for(int l : c)
        {
            System.out.println(l);
        }
    }


}

public class varArgs
{
    public static void main(String[] args)
    {

        Computer obj = new Computer();
        System.out.println(obj.add(3, 100, 1));
        
        Computer obj2 = new Computer();
        obj2.disp("Rakesh Kumar Parida : ", 20);
        
    } 
}