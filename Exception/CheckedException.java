public class CheckedException{
    public static void main(String[] args){
        //we are writing Filewriter class to write to a file
        //during compile time, exception is checked and found, that the code might
        //throw IOException later on if goes unchecked
        java.io.FileWriter fw=new java.io.FileWriter("abc.java");
    }
}