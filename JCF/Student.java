import java.io.Serializable;

class Student implements Serializable{
    public static long serialVersionUID=234L;
    private int id;
    private String name;
    private int age;
    private String address;

    Student(){}
    Student(int id,String name, int age, String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public int getId(){ return id;}
    public String getName() { return name;}
    public int getAge(){ return age;}
    public String getAddress(){ return address;}
    
    public void setId(int id){ this.id=id;}
    public void setName(String name){ this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setAddress(String address){this.address=address;}

    @Override
    public String toString(){
        return this.getId()+" "+this.getName()+" "+this.getAge()+" "+this.getAddress();
    }

}