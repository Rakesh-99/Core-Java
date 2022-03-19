// Inheritance 




class Addition
{
    public int add(int a ,int b)
    {
        return a + b;
    }
        
}

class SubStraction extends Addition{

    public int sub(int c, int d) {
        return c - d;
    }

    
}

public class InheritanceDemo 
{
    public static void main(String[] args)
    {
        SubStraction obj = new SubStraction();
        int find1 = obj.add(10, 20);
        int find2= obj.sub(10, 20);

        System.out.println(find1+ " " + find2);
       
       
        
    }
}