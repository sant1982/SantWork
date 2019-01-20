import java.util.*;

public class TreeSetExample{

    public static void main(String[] args){

        //TreeSet is similar to HashSet but it also does ascending to descending sorting
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("Ram");
        ts.add("Hari");
        ts.add("Sita");
        ts.add("Ram");

        for(String s:ts){
            System.out.println(s);
        }
    }
}