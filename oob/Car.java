public class Car{
    public static void main(String... args)
    {
        Toyota.gear(); Lamborghini.gear();
        Toyota.price(); Lamborghini.price();
    }
}

class Toyota {
    public static void gear()
    {
        System.out.println("Gear of Toyota is 3");
    }
    public static void price()
    {
        System.out.println("Price of Toyota is $10000");
    }
}

class Lamborghini {
    public static void gear()
    {
        System.out.println("Gear # of Lamborgini is 10");
    }
    public static void price(){
        System.out.println("Price of Lamborginin is $50,000");
    }
}