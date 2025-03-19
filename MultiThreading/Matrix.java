import java.util.*;
public class Matrix
{
    public static void main(String []arg)
    { int i,j;
        Scanner s=new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        System.out.println("Enter elements in 2-D Matrix :");
        for(i=0; i<3; i++)
        {
            for(j=0;j<3;j++)
                System.out.println("Enter values in 2D Array :");
                a[i][j]=s.nextInt();
        }
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
                System.out.println("Enter values in 2D Array");
                b[i][j]=s.nextInt();
        } 
        for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]);
System.out.println();
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println(b[i][j]);
System.out.println();
}
}
    }
}
