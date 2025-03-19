import java.util.*;
class Neon
{
    public static void main(String args[])
    {
        System.out.println("TO check teh given number is neon number or not :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check the given number is neon number or not :");
        int n=sc.nextInt();
        int sq=n*n;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            int q=sq%10;
            sq=sq/10;
            count =count+q;
        }
        if(count==n)
        {
            System.out.println(" It is a neon number ");
        }
        else
        {
            System.out.println("It is not a given number ");
        }
    }
}
