public class Father extends Son{

    public static void main(String... args)
    {
        Son s=new Son();
        System.out.println(s.a);
        //passing array
        int[] a={1,2,3,4};
        s.printArray(a);
        //passing single value
        System.out.println("passing single value");
        s.printArray(20);
        //passing multiple value
        System.out.println("passing multiple value");
        s.printArray(20,4,30);
        System.out.println("passing no value");
        s.printArray();
    }
}

class Son {
    public void printArray(int... a)
    {
        for(Integer s:a)
        {
            System.out.println(s);
        }
    }
    protected int a=10;
}