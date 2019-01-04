
public class varArgs{

    public static void main(String... args)
    {
        Son.printArray(args); //For calling static methods or values
        Son s=new Son();
        //passing array 
        s.printArray(args);     
    }
}

class Son {
    public static void printArray(String... a)
    {
        for(String s:a)
        {
            System.out.println("Length of "+s+" is "+s.length());
        }
    }
}