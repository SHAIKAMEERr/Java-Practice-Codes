import java.util.*;
class CHoneH
{
    public static void main(String []args)
    {
        System.out.println("Bitwise Operators : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of B : ");
        int b=sc.nextInt();
        int c=a&b;
        int d=a|b;
        int e=~a;
        int f=~b;
        int g=a<<1;
        int h=b<<1;
        int i=a>>1;
        int j=b>>1;
        int k=a>>>1;
        int l=a^b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

    }
}