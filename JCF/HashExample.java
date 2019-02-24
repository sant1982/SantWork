import java.util.*;

public class HashExample{

    public static void main(String[] args){

        HashMap<String,String> hm=new HashMap<String,String>();

        hm.put("name","Hari");
        hm.put("address","putalisadak");
        hm.put("name","Sita");
        hm.put(null,"something");

        //printing all the elements, value and key in HashMap
        for(Map.Entry x: hm.entrySet()){
        System.out.println(x.getKey()+" "+x.getValue());
        }

        //for getting value according to the key
        System.out.println(hm.get("name"));
        System.out.println(hm.get("address"));
        System.out.println(hm.get(null));
    }
}