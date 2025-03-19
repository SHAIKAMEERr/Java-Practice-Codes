import java.util.*;
class HomeWork2
{
    public static void main(String []args)
    {
        System.out.println("JAva Program to check two Strings are equal or Not : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String : ");
        String a=sc.next();
        System.out.println("Enter Second String : ");
        String b=sc.next();
        System.out.println(a.equalsIgnoreCase(b));
    }
}