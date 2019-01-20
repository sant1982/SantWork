import java.util.Scanner;

public class SantCustomException extends Exception{

    SantCustomException(String message){
        super(message); //suerp construction calls a super class
    }
}

    /*public static void Hello(int a, int b) throws java.io.IOException{ //used to propagate the exception
    //to throw exception intentionally by programmer
    if(b==0){
        throw new java.io.IOException("You cannot divide by zero"); //generate exception
            }
    else{
        System.out.println("Your result is: "+a/b);
    }
    }
    public static void main(String[] args) throws java.io.IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer number");
        int first=sc.nextInt();
        System.out.println("Enter second integer number");
        int second=sc.nextInt();
        
        try{
        Hello(first,second);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}*/