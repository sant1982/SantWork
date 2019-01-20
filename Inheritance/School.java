import java.io.Serializable;

class School implements Serializable
{
    public static long serialVersionUID=234L;
    private int classCount;
    private String schoolName;
    School(){}
//Getters should have same datatype for the variables e.g. integer and string here, and is public
public int getclassCount(){ return classCount; }
public String getschoolName(){ return schoolName; }
//Setters takes parameters for setting private variables, return type is void, and is public
public void setclassCount(int classCount){ this.classCount=classCount; }
public void setschoolName(String schoolName){ this.schoolName=schoolName; }
}