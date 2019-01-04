import javax.lang.model.util.ElementScanner6;

/** This class demonstrates the use of object and methods inside a class
@author Santosh Sharma
*/

class helloWorld{
   // static int b=20; //b is declared inside a class so its a global variable
public int printMessage(String message){
    int lengthOfMsg=message.length();
    return lengthOfMsg;
}
public String oddEven(int num)
{
    String s=(num%2)==0?"Even":"Odd";
    return s;
}
public int valCompare(int num1,int num2)
{
    return (num1>num2)?num1:num2;
}
//division finder method that takes percentage as input and returns the division as output
public String divFinder(int marks)
{
    switch(marks/10)
        {
            case 10:
            case 9:
            case 8:
            return "distiction";
            //break;
            case 7:
            case 6:
            return "first";
            //break;
            case 5:
            return "second";
            //break;
            case 4:
            return "third";
            //break;
            default:
            return "failed";
}
}
   public static void main(String[] args)
    {
        helloWorld hw=new helloWorld(); //creating object of class helloWorld
        int msgLength=hw.printMessage("My custom message"); //accessing the global method by object created
        System.out.println("The message length is:"+msgLength);
        System.out.println("Your number is:"+hw.oddEven(3));
        System.out.println("Big Num is:"+hw.valCompare(4,7));
        System.out.println("Your division is:"+hw.divFinder(81));
        //int a=10; // a is declared inside main method so its scope is local
        //System.out.println(a);
        //System.out.println(b);
    }
}