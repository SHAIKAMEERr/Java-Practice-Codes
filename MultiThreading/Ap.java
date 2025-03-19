import java.util.*;
class Ap
{
    public static void main(String args[])
    {
        System.out.println("Java program for Arithematic Progression : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();
        System.out.println("enter no of terms do you want in Arithmetic progression");
        int n=sc.nextInt();
        int num3=num2-num1;
        for(int i=1;i<=n;i++)
        {
            int x=num2+num3;
            System.out.println(x);
        }
    }
}