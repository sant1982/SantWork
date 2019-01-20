import java.util.*;

public class CollegeList{

    public static void main(String[] args){
        College c=new College();
        c.setId(1);
        c.setName("Gyan Kunja");
        c.setAddress("putalisadak");
        c.setPhone(5538234);
        c.setEmail("info@gyankunja.com");

        College c1=new College(2,"British College","Thapathali",43333,"info@..com");

        ArrayList<College> c2=new ArrayList<College>();
        c2.add(c);
        c2.add(c1);

        for(College t:c2)
        {
            System.out.println(t); // call toString() method as default
        }
    }
}