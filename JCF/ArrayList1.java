import java.util.*;

public class ArrayList1{
   @SuppressWarnings("unchecked")
    public static void main(String[] args){
        //Generic Collection example
        ArrayList a= new ArrayList();
        a.add(10);
        a.add("hello");
        a.add(3.5);

        Iterator i=a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        //Non-generic collection example
        //use <> diamond operator for non-generic type declaration
        //use wrapper class or non primitive datatype within diamond operator

        ArrayList b=new ArrayList<Integer>(); 
        b.add(2);
        b.add(4);

        /*Iterator j=b.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }*/

        for(Integer e:b) 
        { System.out.println(e); }
    }
}