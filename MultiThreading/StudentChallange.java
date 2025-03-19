import java.util.*;
class StudentChallange
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Mail ID : ");
        String str=sc.next();
        int i=str.indexOf('@');
        String userName=str.substring(0,i);
        int n=str.indexOf('.');
        String domine=str.substring(i+1,str.length());
        String domineName=str.substring(i+1,n);
        System.out.println("Your User Name is : "+userName);
        boolean b=domineName.equals("gmail");
        System.out.println("Your mail is in the Gmail Domine : "+b);
        System.out.println("your Mail ID is in the following Domin : "+domineName);
        System.out.println("Type of Mail YOu are Using : "+str.substring(n+1,str.length()));


    }
}