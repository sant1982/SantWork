import java.util.Scanner;

public class mMultiplication{
    public static void main(String[] args)
    {
        int a[][]=new int [2][2];
        int b[][]=new int [2][2];
        int mul[][]=new int[a.length][a[0].length];
        
        Scanner sc=new Scanner(System.in);
        System.out.println("You are about to perform matrix multiplication: 'Yes'?");
        String input=sc.next();
        while(input.toLowerCase().equals("yes"))
        {
            System.out.println("Enter the number?");
            int input2=sc.nextInt();
            System.out.println(input2%2==0?"even":"odd");
            System.out.println("Type 'Yes' to continue");
            input=sc.next();
        }
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                for(int k=0;j<a[0])
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}