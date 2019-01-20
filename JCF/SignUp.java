import java.io.Serializable;

class SignUp implements Serializable
{
    public static long serialVersionUID=234L;
    private String uName;
    private String uPwd;
    private String Email;
   
    SignUp(){    }
    //Setting values at once
    SignUp(String uName,String uPwd, String Email)
    {
        this.uName=uName;
        this.uPwd=uPwd;
        this.Email=Email;
    }
    
//Getters for id/name, should have same type i.e. integer and string, and is public
public String getUName(){ return uName;}
public String getUPwd(){ return uPwd;}
public String getEmail(){ return Email;}

//Setters takes parameters, return type is void, and is public
public void setUName(String uName){this.uName=uName;}
public void setUPwd(String uPwd){this.uPwd=uPwd; }
public void setEmail(String Email) { this.Email=Email;}

@Override
public String toString(){
    return this.getUName()+" "+this.getUPwd()+" "+this.getEmail();
}
}