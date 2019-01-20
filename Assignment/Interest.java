import java.util.Scanner;

public class Interest{

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
            int pAmount=sc.nextInt();
        System.out.println("Enter the interest rate");
            float iRate=sc.nextFloat();
        System.out.println("Enter the number of years");
            int years=sc.nextInt();
           
            float intAmount= pAmount*(1+((iRate/100)*years));

        System.out.println("The total accured amount is: "+intAmount);  
     }
}