import java.util.*;
class Fibbo
{
    public static void main(String args[])
    {
        System.out.println("Java program for Fibbonacci series :");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of terms do you want :");
        int n=sc.nextInt();
        int a=0,b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}