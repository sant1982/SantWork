import java.io.Serializable;

public class District implements Serializable{
    public static long serialVersionUID=234L;
    private int id;
    private String name;
    private String province;

    District(){}

    District(int id, String name, String province){
        this.id=id;
        this.name=name;
        this.province=province;
    }

    public int getId(){ return this.id;}
    public String getName(){ return this.name;}
    public String getProvince(){ return this.province;}

    public void setId(int id){ this.id=id;}
    public void setName(String name){ this.name=name;}
    public void setProvince(String province){this.province=province;}

    @Override
    public String toString(){
    return this.getId()+" "+this.getName()+" "+this.getProvince();
    }

}