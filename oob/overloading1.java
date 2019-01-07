public class overloading1{

    overloading1(){
        System.out.println("Ram");
    }

    overloading1(String s1, String s2)
    {
        System.out.println(s1+" "+s2);
    }

    public void printName(){
        System.out.println("Ram Prasad");
    }
    public void printName(String name){
        System.out.println(name);
    }
    public void printName(String name1, String name2){
        System.out.println(name1+" "+name2);
    }
    
    public static void main(String[] args){
        overloading1 o1=new overloading1();
        overloading1 o2=new overloading1("Hari","Ram");
        o1.printName();
        o1.printName("Ram");
        o1.printName("Ram","Sita");
    }
}