interface JavaTraining{
    void syllabus(); //if only one method is declared inside interface they are called functional interface
    
}

public class Training{

    public static void main(String[] args){
    JavaTraining jt= ()->System.out.println("Hello i am syllabus");
       /* Otherway of writing above code where there are multiple methods in interface 
       JavaTraining jt=new JavaTraining(){
        @Override
        public void syllabus(){
            System.out.println("Hello i am syllabus");
        }
    };*/
    jt.syllabus();
    }
}