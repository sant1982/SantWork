import java.util.*;

import javax.naming.NameNotFoundException;

public class StudentList{
    
    private ArrayList<Student> sl;

    StudentList(){
    sl=new ArrayList<Student>();
        sl.add(new Student(1,"Hari",32,"Baneshwor"));
        sl.add(new Student(2,"Shyam",31,"Koteshwor"));
        sl.add(new Student(3,"Roshan",28,"Tahachal"));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the name you want to search");

        String name=sc.next();
        
        StudentList sl=new StudentList();//blank constructor called
        try{
        sl.searchNameStudent(name);
        }catch(NameNotFoundException e){
            System.out.println(e);
        }
    }

    public void searchNameStudent(String name)throws NameNotFoundException{
        int flag=0;
        for(Student x:sl)
        {
            if(x.getName().contains(name)){
                flag=0;
                System.out.println("Relevant search result is:");
                System.out.println(x);
            }
        }
        if(flag==0){
                throw new NameNotFoundException("Your inserted name is not found in student database");
        }
    }
}