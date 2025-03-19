import java.util.*;
class Patternsone
{
    public static void main(String args[])
    {
        System.out.println("Java program for patterns programs  :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int i,j,count=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                count=count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}