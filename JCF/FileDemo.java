import java.io.*;

public class FileDemo{

    public static void main(String[] args){
        try{
        File f=new File("something.txt");
        f.createNewFile();
        
        }catch(IOException e){
            System.out.println(e);
        }
    }
}