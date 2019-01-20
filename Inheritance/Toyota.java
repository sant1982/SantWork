interface Car{
    int gear=4;
    int wheels=4;
    void speed();
}

public class Toyota implements Car{
@Override
public void speed(){
    System.out.println("300 km/hr");
}
int gear=6;
    public static void main(String[] args){
         
        Toyota t1=new Toyota();
        t1.speed();
        System.out.println(t1.gear); //First checks the variable within the class
        System.out.println(t1.wheels);
    }
}