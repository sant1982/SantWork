import java.util.*;

public class SignUpChecker{
    public static void main(String[] args){
        //ArrayList always maintain the insertion order
       // ArrayList<String> b=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String user="";
        String pwd="";
        String email="";
        String choice;
        SignUpChecker s1=new SignUpChecker();

        do{
            System.out.println("Enter your UserName");
            user=sc.next();
            try{
                System.out.println("Enter your Password");
                pwd=sc.next();
                s1.checkUserInfo(user,pwd);  
                System.out.println("Enter your Email id");
                email=sc.next();   
                            
                SignUp s2=new SignUp(user,pwd,email);
                System.out.println(s2); //Showing user information-username, password, email id
            }catch(PasswordWeakException e){
            System.out.println(e);
            }catch(UsernameDuplicateException e){
            System.out.println(e);
            }
            System.out.println("Do you wish to Continue: 'Yes'?");
            choice=sc.next();
        }
        while(choice.toLowerCase().equals("yes")); 
    }

    public void checkUserInfo(String name,String pwd) throws PasswordWeakException, UsernameDuplicateException 
        {
            int flag=0;
            if(name.equals(pwd))
            {
                throw new UsernameDuplicateException("Your password and username cannot be the same");
            }
            
        if (pwd.length() >= 8)
        {
            for (int i = 0; i <= pwd.length(); i++)
            {
            char x = pwd.charAt(i);
            String
            if(Character.isDigit(x))
            {
                    flag=1;
            }
            }
            if(flag==0)
                {
                    throw new PasswordWeakException("Your password must contain at least one number");
                }
        }
        else{
            System.out.println("Your password must have at least 8 characters");
        }   
        }
}
