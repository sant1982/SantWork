public class School1{
    public static void main(String[] args){
        School s=new School();
        s.setschoolName("Gems International Boarding School");
        s.setclassCount(5);
        School1 s1=new School1();
        s1.printSchoolDetails(s);//s is the object of the school passed to printSchoolDetails method
    }

    public void printSchoolDetails(School t){//t is the receiver end of the data sent from the s
        System.out.println("Your school name is:"+t.getschoolName());
        System.out.println("YOur class id is:"+t.getclassCount());
    }
}