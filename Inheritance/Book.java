import java.io.Serializable;

class Book implements Serializable
{
    public static long serialVersionUID=234L;
    private int id;
    private String name;
    Book()
    {

    }
//Getters for id/name, should have same type i.e. integer and string, and is public
public int getId()
{
    return id;
}
public String getName()
{
    return name;
}
//Setters takes parameters, return type is void, and is public
public void setId(int id)
{
//this.id=id;
System.out.println("Printing id:"+id);
System.out.println("Printing this.id:"+this.id);
}
public void setName(String name)
{
this.name=name;
}

public static void main(String[] args){
    Book b=new Book();
    b.id=10;
    b.setId(24);
}
}