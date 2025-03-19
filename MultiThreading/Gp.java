import java.util.*;
class Gp
{
    public static void main(String args[])
    {
        System.out.println("Jaava program for GP Series :");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first term of gp");
        int a=sc.nextInt();
        System.out.println("enter the difference :");
        int d=sc.nextInt();
        System.out.println("Enter no of terms : ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            a=a*d;
        }
    }
}