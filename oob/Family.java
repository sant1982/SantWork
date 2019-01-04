public class Family{
    public static void main(String... args)
    {
        System.out.println(Daughter.name()+" "+Daughter.surname());
    }
}

class Daughter {
    public static String name()
    {
        return "Radha";
    }
    public static String surname()
    {
        return "Dhami";
    }
}

