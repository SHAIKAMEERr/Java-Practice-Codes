import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        System.out.println("Java program for palandrome number : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check the given number is palindrome number or not : ");
        int i=sc.nextInt();
        int m=i;
        int rev=0;
        while(i>0)
        {
            int n=i%10;
            rev=rev*10+n;
            i=i/10;
        }
        if(m==rev)
        {
            System.out.println("It is a palindrome number : ");
        }
        else
        {
            System.out.println("It is not a palindrome number :");
        }
    }
}