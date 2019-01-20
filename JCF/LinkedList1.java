import java.util.*;

public class LinkedList1{
       public static void main(String[] args){
        //ArrayList always maintain the insertion order
        // LinkedList<String> st=new LinkedList<String>(); 
        Vector<String> st=new Vector<String>(); //for vector
        st.add("Tanka Bhatta");
        st.add("Shrish Adhikari");
        st.add("Sailaja Shrestha"); //setting the value at zero index
        st.add("Tek Adhikari");
      
        //printing the Names of ArrayList
        for(String w:st) 
        { 
        System.out.println(w);
        }
    }
}