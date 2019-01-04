class BitTest {
    public static void main(String[] args){
        int a=10;
        int b=-20;
        //NOT operator output
        System.out.println(~a);
        System.out.println(~b);

        //AND operation output
        System.out.println(a&b);
        //OR operation output
        System.out.println(a|b);
        //XOR operation output
        System.out.println(a^b);

        a=10;
        //Let shift operator
        System.out.println(a<<1);
        System.out.println(a>>2);    
        b=-10;
        System.out.println(b>>>1);   
    }
}