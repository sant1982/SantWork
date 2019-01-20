interface Cup{
    int Stress(int strength, int durability);
}

public class ChineseCup{
    public static void main(String [] args)
    {
       Cup c1=new Cup(){
           @Override
           public int Stress(int s1, int d2){
            return s1*d2;
           }
        };
    
    System.out.println("Your cup stress quotient is:"+c1.Stress(4,5));
    }
}