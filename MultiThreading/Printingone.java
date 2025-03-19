import java.util.*;
class Printingone
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name : ");
        long s=sc.nextLong();
        int n=sc.nextInt();
        System.out.printf("%04d\n",n);
        System.out.printf("%07d",s);
    }
}