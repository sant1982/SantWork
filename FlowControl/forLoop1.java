class forLoop1 {
    public static void main(String[] args){
        int i;
        /*
        for(i=0; i<5;i++)
        {
            System.out.println(i);
        }
        System.out.println(i);*/

        for(i=0; i<=100;i=i+2) //print even
        {
            System.out.println(i);
        }

        for(i=1; i<=100;i=i+2) //print odd
        {
            System.out.println(i);
        }
            
int sum=0;        
        for(i=0; i<=100;i++) //sum upto 100
        {
            sum+=i;  
        }
        System.out.println(sum);
//String reverse statement
String s1="Hello";
String reverse="";
        for(i=4;i>=0;i--)
        {
            reverse=reverse+s1.charAt(i);
        }
        System.out.print(reverse);
}

}