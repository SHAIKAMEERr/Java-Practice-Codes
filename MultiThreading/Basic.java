import java.io.*;
import java.util.*;
public class Basic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your First name : ");
String Fname=sc.next();
System.out.println("Enter your Last Name : ");
String Lname=sc.next();
System.out.println("Hello "+Fname+" "+Lname+ " Welcome to our website");
System.out.println("Would you LiKE to continue in our website? ");
System.out.println("1.YES");
System.out.println("2.NO");
int n=sc.nextInt();
if(n==1)
{
System.out.println("Enter Your Age :");
int age=sc.nextInt();
}
else
{
System.out.println("ThankYou For Visiting !!!");
}
}
}