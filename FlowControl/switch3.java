class switch3
{
    public static void main(String[] args)
    {
      java.util.Scanner sc=new java.util.Scanner(System.in);
      System.out.println("Enter exam percentage");
        int a=sc.nextInt();
            
        switch(a/10)
        {
            case 10:
            case 9:
            case 8:
            System.out.println("You go distiction");
            break;
            case 7:
            case 6:
            System.out.println("You go first division");
            break;
            case 5:
            System.out.println("You got second division");
            break;
            case 4:
            System.out.println("You got third division");
            break;
            default:
            System.out.println("you failed");   
        }
    }
}