public class NameChecker{

    public static void main(String[] args) throws SantNameException{
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.next();

        if (name.equalsIgnoreCase("mohammed")){
            throw new SantNameException("You cannot enter this name");
        }
    }
}