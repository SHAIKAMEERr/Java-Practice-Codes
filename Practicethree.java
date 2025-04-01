import java.util.*;
class Practicethree
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
       /*  System.out.println("Enter first term :");
        int a=sc.nextInt();
        System.out.println("enter the difference term :");
        int d=sc.nextInt();
        System.out.println("Enter the no of terms do you want :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            a=a*d;
        }*/

        System.out.println("Enter no of terms :");
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<=n;i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
           b=c;

        }
        
    }
}