public class arrayTest{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4};
        String names[]={"Ram","Shyam","Hari","Geeta"};
        Float values[]={2.5f,2.0f,3.0f,5.0f};
        int sum=0;
        for(int i=0;i<4;i++)
        {
            System.out.println(a[i]);
            System.out.println(names[i]);
            System.out.println(values[i]);
            /*Arraylist a1=new Arraylist();
            a1.add("hi");
            a1.add(2.5);
            a1.add("%");
            a1.add(2);
            System.out.println(a1[i]);*/
            sum=sum+a[i];
        }
        System.out.println("Sum of the array is:"+sum);
    }
}