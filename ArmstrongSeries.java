import java.util.Scanner;
class ArmstrongSeries
{
    static void Armstrong(int n)
    {
        for(int i=100;i<n;i++)
        {
        int sum=0,r;
        int m=n;
        while(n>0)
        {
            int div=n%10;
            n=n/10;
            r=div*div*div;
            sum=sum+r;
        }
        if(sum==m)
        {
            System.out.print(m+" ");
        }
    }
    }
    public static void main(String args[])
    {
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        System.out.println(Armstrong(n));*/
        for(int i=100;i<1000;i++)
        {
            Armstrong(i);
        }
    }
}