import java.util.*;
class Widening
{
    public static void main(String []args)
    {
        System.out.println("Java Program for Widening & Narrowing of Data : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of I : ");
        int i=sc.nextInt();
        System.out.println("Enter the value of L : ");
        long l=sc.nextInt();
        byte b=(byte)i;
        short s=(short)i;
        float f=(float)i;
        float F=(float)l;
        double d=(short)s;
        System.out.println(b);
        System.out.println(s);
        System.out.println(f);
        System.out.println(F);
        System.out.println(d);

    }
}