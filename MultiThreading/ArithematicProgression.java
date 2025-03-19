import java.util.*;
class Arithematicprogression
{
    public static void main(String args[])
    {
       /* First way to find ap with the help of two terms and difference 
        System.out.println("Java program for Arithematic Progression : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();
        System.out.println("enter no of terms do you want in Arithmetic progression");
        int n=sc.nextInt();
        int d=num2-num1;
        int t=num1;
        for(int i=1;i<=n;i++)
        {
            int x=t+d;
            System.out.print(x+" ");
            t=t+d;
        }*/


        //Secont way to find ap with first term and difference 
        System.out.println("Java program to find AP of the given number :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        System.out.println("Enter the difference :");
        int d=sc.nextInt();
        System.out.println("enter number of times do you want to perofrm ap : ");
        int n=sc.nextInt();
        int x=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(x+" ");
            x=x+d;

        }

    }
}