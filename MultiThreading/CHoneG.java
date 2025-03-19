import java.util.*;
class CHoneG
{
    public static void main(String []args)
    {
        System.out.println("Increment & Decrement Operators : ");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Value of A : ");
        int a=s.nextInt();
        System.out.println("enter the Value of B : ");
        int b=s.nextInt();
        int c=a++*++b;
        char ch='x';
        ch++;
        System.out.println(ch);
        System.out.println(c);
    }
}