class StaticTest{
    static{
        int i=10;
        System.out.println("static block called");
    }

    StaticTest(){
        System.out.println("Hi i am constructor");
    }

    public static void main(String[] args){
        StaticTest st=new StaticTest();
        System.out.println(StaticTest2.testMethod());
    }
}

class StaticTest2
{
    static String name;
    static{ //static block
        name="Rameshwor Khanal";
    }
    public static String testMethod()
    {
        return name;
    }
}