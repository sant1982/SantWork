class primeNum 
{
    public static void main(String[] args)
    {
        int n=13;
        int flag=0;
    if(n%2!=0)
        {
        for(int i=2; i<=n/2;i++){
            System.out.println(n+"%"+i+"="+(n%i));
            if(n%i==0)
            {
                flag=1;
            }
            }
        if(flag==1)
            {
            System.out.println("Not Prime");
            }
        else
            {
            System.out.println("Prime");
            }
        }
    else {
            System.out.println("Not prime");
        }

    //For each loop practice
        int [] a={1,2,3};
        int sum=0;
        for(Integer x:a)
        {
            sum+=x;
            System.out.println(sum);
        }
        String [] names={"Ram","Shyam", "Hari"};
        String Concat="";
        for(String name:names)
        {
            System.out.println(name);
            Concat+=name;
        }
        System.out.println(Concat);

//Static while loop practice
        int i=0;  
        while (i<4)
        {
            System.out.println(i);
            i++;
        }

        /*
       int n=30; 
       for(int i=3; i<=n;i++) //finding prime number
        {
            for (int j=2; j<=n/2;j++){
            if(i%j==0 && j%i==0){
                System.out.println(i);
            }
            }   

        }*/
    }

}