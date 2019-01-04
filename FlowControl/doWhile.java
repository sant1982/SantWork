//Dynamic do while loop practice
import java.util.Scanner;

class doWhile
{
    public static void main(String[] args)
    {
        /*int i=1;
        do{
            i++;
            System.out.println("Hello");
        }
        while(i<=1);*/

        Scanner sc=new Scanner(System.in);
        String input;
        
        do{
            System.out.println("Enter the number?");
            int input2=sc.nextInt();
            System.out.println(input2%2==0?"even":"odd");
            System.out.println("Do you wish to Continue to find odd/even: 'Yes'?");
            input=sc.next();
        }
        while(input.toLowerCase().equals("yes"));
    }
}