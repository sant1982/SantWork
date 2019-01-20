import java.util.Scanner;

public class Quotient{

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend");
            int dividend=sc.nextInt();
        System.out.println("Enter the divisor");
            int divisor=sc.nextInt();
            int remainder;
            int quotient;
        if(dividend>=divisor)
        {
            quotient=dividend/divisor;
            remainder=dividend-(quotient*divisor);
            
         System.out.println("The quotient is: "+quotient);
         System.out.println("The remainder is: "+remainder);  
        }
        else
        {
            System.out.println("Action not possible. Dividend is less than divisor");
        }
    }
}