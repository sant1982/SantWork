import java.util.*;

public class DistrictMap{

    public static void main(String[] args){
        HashMap<String,District> hm=new HashMap<String,District>();
        hm.put("ktm",new District(1,"Kathmandu","Province 3"));
        hm.put("skt",new District(2,"Surkhet","Province 6"));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a district");
        String s1=sc.next();
        System.out.println(hm.get(s1));
    }
}