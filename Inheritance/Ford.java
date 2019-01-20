class Car{
    int gear=4;
    int wheels=4;
    public void speed(){
        System.out.println("200 km/hr");
    }
}

public class Ford extends Car{
@Override
public void speed(){
    System.out.println("300 km/hr");
}

int gear=6;
    public static void main(String[] args){
         
        Ford t1=new Ford();
        t1.speed();
        System.out.println(t1.gear); //First checks the variable within the class
        System.out.println(t1.wheels);

        Car c1=new Car();
        System.out.println(c1.gear);
        c1.speed();
        Car c2=new Ford();
        System.out.println(c2.gear);
        c2.speed();
    }
}