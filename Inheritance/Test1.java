import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Test1 extends Object{
    int a=10,b=20;
    int id;
    public static void main(String[] args){
        Test1 t1=new Test1();
        System.out.println(t1);
        
        //to clone the object
        //t1.id=22;
        //Test1 t2=(Test1) t1.clone();
        //System.out.println(((Test1)t1.clone()).id);

        Class c=t1.getClass(); //using object class getClass() method
        for(Method m: c.getMethods()){
            System.out.println(m);
        }

        for(Field f:c.getFields()){
            System.out.println(f);
        }
        /*String s="Hello World";
        System.out.println(s.hashCode());
        System.out.println(t1.equals(s)); */
        
    }
    @Override
    public String toString(){
        return "a= "+a+" b="+b;
    }
}