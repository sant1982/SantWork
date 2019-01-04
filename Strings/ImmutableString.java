class ImmutableString{
    public static void main(String[] args){
       /* String s1="Hello World";
        //String s2="Hello World";
        //String s=new String("Hello World");

        System.out.println(s1==s2);
        System.out.println(s1==s); //check the reference poiint of two strings

        System.out.println(s1.equals(s2)); //compares the strings of the reference point
        System.out.println(s1.equals(s));*/

        String s1=new String (args[0]);
        String s2=new String (args[1]);

        System.out.println(s1.equals(s2));
    }
}