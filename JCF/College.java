import java.io.Serializable;

class College implements Serializable
{
    public static long serialVersionUID=234L;
    private int id;
    private String name;
    private String address;
    private int phone;
    private String email;
    College(){    }
    //Setting values at once
    College(int id, String name,String address,int phone, String email)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }
    
//Getters for id/name, should have same type i.e. integer and string, and is public
public int getId(){ return id;}
public String getName(){ return name;}
public String getAddress(){ return address;}
public int getPhone() { return phone;}
public String getEmail() {return email;}
//Setters takes parameters, return type is void, and is public
public void setId(int id) {this.id=id;}
public void setName(String name){this.name=name;}
public void setAddress(String address){this.address=address; }
public void setPhone(int phone){    this.phone=phone;}
public void setEmail(String email){    this.email=email;}

@Override
public String toString(){
    return this.getId()+" "+this.getName()+" "+this.getAddress()+" "+this.getPhone()+" "+this.getEmail();
}
}