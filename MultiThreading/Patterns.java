import java.util.*;
class Patterns
{
    public static void main(String args[])
    {
        System.out.println("Java program for pattern solving : ");
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int count=0;
         for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>=i)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if( i==n ||j==1 || j==n-1 || i==1 )
                {
                    System.out.print(" * ");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        System.out.println("Enter no of lines :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+i-1;j++)
            {
                if(j>=i)
                System.out.print("* ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}