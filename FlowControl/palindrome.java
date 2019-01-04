class palindrome {
    public static void main(String[] args){
        int i;
     
String s1=args[0];
String reverse="";
int length=s1.length();
        for(i=length-1;i>=0;i--)
        {
            reverse=reverse+s1.charAt(i);
        }
        if(s1.equals(reverse)){
            System.out.println("This string is palindrome");
        }
        else{
            System.out.println("This string is not palindrome");
        }

        StringBuilder sb=new StringBuilder(args[0]);
        StringBuilder reverse1=sb.reverse();
        //String reverse2=reverse1.toString();
        if(reverse1.toString().equals(args[0]))
        {
            System.out.println("This string is palindrome");
        }
        else{
            System.out.println("This string is not palindrome");
        }
        
        
}

}