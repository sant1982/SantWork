//Dynamic while loop practice
import java.util.Scanner;

class TestDynamic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you wish to Continue to find odd/even: 'Yes'?");
        String input=sc.next();
        while(input.toLowerCase().equals("yes"))
        {
            System.out.println("Enter the number?");
            int input2=sc.nextInt();
            System.out.println(input2%2==0?"even":"odd");
            System.out.println("Type 'Yes' to continue");
            input=sc.next();
            
           }
            //Print full Name after space
            Scanner sc1=new Scanner(System.in);

            System.out.println("Enter your name");
            String name=sc1.nextLine();
            //int name=sc1.nextInt();
            System.out.println("Enter your address");
            String address=sc1.nextLine();

            System.out.println("Name:"+name);
            System.out.println("Address:"+address);
    }
}