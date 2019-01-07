interface IFileUpload{
    void getFile(String name);
    default String someString(){
        return "random string";
    }
}

public class FileUpload implements IFileUpload{
    @Override
    public void getFile(String name){
    System.out.println(name);
    }

   /* @Override
    public String returnFile(){
        return "something";
    }*/

    public static void main(String[] args){
        FileUpload fileUpload=new FileUpload();
        fileUpload.getFile("Hello.java");
        System.out.println(fileUpload.someString());
    }
}