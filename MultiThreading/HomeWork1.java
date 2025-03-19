import java.util.*;
class HomeWork1
{
    public static void main(String []args)
    {
        System.out.println("Java Program to find biggest among two numbers : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Value : ");
        int x=sc.nextInt();
        System.out.println("Enter Second Value : ");
        int y=sc.nextInt();
        if(x>y)
        {
            System.out.println("First value is Bigger : "+x);
        }
        else
        {
            System.out.println("Second value is Bigger : "+y);
        }
 
    }
}