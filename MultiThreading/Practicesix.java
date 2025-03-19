import java.util.*;
class Practicesix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Java program to find Email ID :");
        System.out.println("Enter Your ID :");
        String s=sc.nextLine();
        int l=s.length();
        int s1=s.indexOf('@');
        String s2=s.substring(0,s1);
        int s3=s.indexOf('.');
        String s4=s.substring(s1+1,s3);
        String s5=s.substring(s3+1,l);
        System.out.println("Your mail ID user name is : "+s2);
        System.out.println("Your mail ID Type is : "+s4);
        System.out.println("Your Mail ID Domain is : "+s5);
    }
}