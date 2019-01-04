class switch1
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        
        switch (a)
        {
            case 1:
            System.out.println("You pressed one");
            break;
            case 2:
            System.out.println("You pressed two");
            break;
            case 3:
            System.out.println("3");
            break;
            default:
            System.out.println("Not the input in our list");   
        }
        
    }
}