import java.util.Scanner;

public class Eligible{

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age of your citizenship");
            int age=sc.nextInt();
        
        if(age>=18){
            System.out.println("Congratulations!You are eligible to vote");
        }
        else{
            System.out.println("Sorry! you are not eligible to vote due to age limit");
        }
             
     }
}