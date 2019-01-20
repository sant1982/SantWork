public class Exception1{
    public static void main(String[] args){
        System.out.println("Program started");
        try{ 
        //code that might gives an exception written here
        System.out.println(1/0); //divide by zero generates an exception
        }catch(Exception e){ System.out.println(e);}

        System.out.println("Work completed");
    }
}