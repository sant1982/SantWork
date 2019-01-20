interface SumInterface{
    void add(int a, int b); //if only one method is declared inside interface they are called functional interface
    
}

public class Sum{
    public static void main(String[] args){
        /*SumInterface sm=new SumInterface(){
            @Override
            public void add(int c,int d){
                System.out.println("Sum is:"+(c+d));
            }
        };*/
        SumInterface sm= (int c, int d)->System.out.println("Sum:"+(c+d));
    sm.add(4,5);
    }
}