import java.util.*;

public class HashSetExample{

    public static void main(String[] args)
    {
        //Hashset only takes unique elements
        //Hashset doesn't maintain insertion order
        HashSet<String> hs=new HashSet<String>();
        hs.add("hello");
        hs.add("hi");
        hs.add("see you");
        hs.add("so on");
        hs.add("so on");

        for(String s:hs){
            System.out.println(s);
        }
    }
}