import java.util.*;
class PracticeLoops
{
    public static void main(String args[])
    {
        /*System.out.println("Java program to print a table for given number :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int i=sc.nextInt();
        for(int n=1;n<=10;n++)
        {
           int j=n*i;
           System.out.println(i+" * "+n+" = "+j);
        

        
        System.out.println("Java program for sum of n natural numbers :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int x=0;
        for(int i=0;i<=n;i++)
        {
           //Formula for Sum of first n natural numbers x=(n*(n+1))/2;
           x=x+i;
        }
            System.out.println("Sum of "+n+" Numbers are:"+x);


        
        System.out.println("Java Program to find the factorial of the given number :");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to find its factorial :");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            System.out.println("Factorial of given number "+i+"! is: "+fact);
        }
        */


        System.out.println("Java program to display the digits of a given number :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        // for(int i=0;i<=n;i++)
        int count=0;
       while(n!=0)
        {
            int x=n%10;
            n=n/10;
            count++;
            System.out.println("Digits of the given number is :"+x+" "+count);
        }
    }
}