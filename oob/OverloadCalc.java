import java.util.*;

public class OverloadCalc{
    public int sum =0;
    public int mul=0;
    public void myCalc(int a, int b){
        sum=a+b;
        mul=a*b;
        System.out.println("Sum result:"+sum);
        System.out.println("Multiplication result:"+mul);
    }
    public void myCalc(int a, int b, int c){
        sum=a+b+c;
        mul=a*b*c;
        System.out.println("Sum result:"+sum);
        System.out.println("Multiplication result:"+mul);
    }
    public void myCalc(int a, int b,int c, int d){
        sum=a+b+c+d;
        mul=a*b*c*d;
        System.out.println("Sum result:"+sum);
        System.out.println("Multiplication result:"+mul);
    }
    
    public static void main(String[] args){
        OverloadCalc Calc1=new OverloadCalc();
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int c;
        c=in.nextInt();
        int d;
        d=in.nextInt();
        Calc1.myCalc(a,b);
        Calc1.myCalc(a,b,c);
        Calc1.myCalc(a,b,c,d);
    }
}