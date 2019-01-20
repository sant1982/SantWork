public class RandomTest{

    public static void Hello(int a) throws SantCustomException{ //used to propagate the exception
    //to throw exception intentionally by programmer
    if(a<18){
        throw new SantCustomException("You are not eligible to buy alcohol below 18 years"); //generate exception
            }
    }
    public static void main(String[] args) throws java.io.IOException{
        //System.out.println(1/0);
        final int a=16;
        try{
        Hello(a);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    /*public static void B(){
        A();
    }

    public static void C(){
        B();
    }
    public static void main(String[] args){
        try{
        C();
        }catch(Exception e){
            System.out.println(e);
        }
    }*/
}