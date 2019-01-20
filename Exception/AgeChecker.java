public class AgeChecker{

    public static void main(String[] args) throws SantCustomException{
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();

        if (age<18){
            throw new SantCustomException("You are restricted to buy alcohal under 18");
        }
    }
}