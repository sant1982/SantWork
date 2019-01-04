class OperatorTest{
    public static void main (String[] args){
        int a=10;
        int b=20;
        int c=1;

    //System.out.println((a%2)==0?"Even":"Odd");
    //System.out.println((b%2)!=0?"Odd":"Even");

    //Integer greater=(a>b?(a>c?a:c):(b>c?b:c)); //if-else is preferred to this ternary operation
    //System.out.println(greater);

a=a^b;
b=a^b;
a=a^b;
System.out.println(a);
System.out.println(b);
    //String s1=new Sting(args[0]);
    //String s2=new String(argas[1]);

    //System.out.println(a>b?"Hi":"Hello");
    //System.out.println(s1>s2?"Hi":"Hello");
    
    //String output=(a==2)? "Hi":"Hello";
    //System.out.println(output); 

    }
}