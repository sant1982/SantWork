class ifElse2 {
    public static void main(String[] args) {
    int scorePercent=Integer.parseInt(args[0]);
    if(scorePercent>80)
    {
       System.out.println("You got Distinction");
    }
    else if (scorePercent>=60 && scorePercent<=80)
    {
        System.out.println("You got First Division");
    }
    else if (scorePercent>=50 && scorePercent<60)
    {
        System.out.println("You got Second Division");
    }
    else
    {
        System.out.println("You Failed");
    }
    }
    }