import java.util.Scanner;
public class Pasical 
{
    public static void main(String []args)
    {
        System.out.println("no of rows: ");
        int a[][];
        Scanner s=new Scanner(System.in);
        int n=6;
        int i,j;
        a=new int[n][n];
        for(i=0;i<=n;i++)
            for(j=0;j<=i;j++)
            {
                if(j==i||j==0)
                {
                a[i][j]=1;
                }
                else
                {
                a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
            }
        for(i=0;i<=n;i++)
            for(j=0;j<=i;j++)
            {
                System.out.print(a[i][j]+" ");
                System.out.println();
            }
    }
}
