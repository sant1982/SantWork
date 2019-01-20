import java.util.*;

public class FriendsName{
       public static void main(String[] args){
        //ArrayList always maintain the insertion order
        ArrayList<String> b=new ArrayList<String>(); 
        b.add("Tanka");
        b.add("Shrish");
        b.add(0,"Sailaja"); //setting the value at zero index
        b.add("Tek Adhikari");
      
        //printing the longest Name
        String longestName=b.get(0);
        System.out.println("Longest Name at start is: "+longestName);
        
        for(String w:b) 
        { 
            if(w.length()>longestName.length()){
            longestName=w;
            }
        }
        System.out.println("Longest Name is: "+longestName);
    }
}