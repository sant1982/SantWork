import java.io.FileWriter;
import java.io.IOException;

public class ArithExcep{
    public static void main(String[] args){

        System.out.println("Program started");
        try{ 
        System.out.println(1/0); //Generates arithmetic exception
        java.io.FileWriter fw=new java.io.FileWriter(".jpt");
        }

       /* }catch(IOException | ArithmeticException e){ 
            System.out.println(e);
        }*/
        catch(ArithmeticException e){
            System.out.println("Arithmetic: "+e);
        }
        catch(IOException e){
            System.out.println("IO: "+e);
        }
        finally{
        System.out.println("I am executed");
        }
    }
}