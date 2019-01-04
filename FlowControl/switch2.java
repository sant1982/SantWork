class switch2
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter capital city name to know Country");
        String a=sc.next();
        switch(a.toLowerCase())
        {
            case "kathmandu":
            System.out.println("Your entered capital of Nepal");
            break;
            case "bangkok":
            System.out.println("You entered capital of Thailand");
            break;
            default:
            System.out.println("We don't have country matching your input");
        }

        //Identification of odd-even number
        /*System.out.println("Enter a number");
        int a=sc.nextInt();
        
        switch (a%2)
        {
            case 0:
            System.out.println("You pressed even number");
            break;
            default:
            System.out.println("you pressed odd number");   
        }
        */
    }
}