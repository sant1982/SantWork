import javax.lang.model.util.ElementScanner6;

class ifElse1 {
public static void main(String[] args) {
    int a=1000;
    //String b=String.valueOf(a);
    //String s=args[0];
    if (args[0].length()!=4)
    { 
        System.out.println("Enter 4 digit character");
    }
    else 
    {
        System.out.println("Now you can enter");
    }
    /*if (String.valueOf(a).length()!= 4)
    {
        System.out.println("Your length should be 4");
    }*/
   
//Check even odd

if(Integer.parseInt(args[0])%2==0)
{
    System.out.println("Your number is even");
}
else
{
    System.out.println("Your number is odd");
}

//Take two value salary and age; if age is < 25, calculate 10% tax otherwise 25% tax
//float Salary=Float.parseFloat(args[0]);
//int age=Integer.parseInt(args[1]);
double Salary= Double.parseDouble(args[0]);
int age=Integer.parseInt(args[1]);
if(age<25)
{
    Salary =(double)0.10*Salary;
    System.out.println("You tax payment was:"+Salary);
    //System.out.println(Salary);
}
else if (age<25 && age<=30)
{
    Salary =(double)0.25*Salary;
    System.out.println("You tax payment was:"+Salary);
}
else
{
    Salary =(double)0.35*Salary;
    System.out.println("You tax payment was:"+Salary);
}
}
}