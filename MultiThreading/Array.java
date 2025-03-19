/*import java.util.Scanner;
public class Array {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        System.out.println("array matrix :");
        System.out.println("enter elements of an array :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter elements in matrix :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("--------------------");
        System.out.println("first matrix :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
                System.out.print("");
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        System.out.println("Second matrix :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+""); 
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
           {
                System.out.println(b[i][j]+" ");
            }
        }
        System.out.println("Addition of two matrix: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("substraction of two matrix :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int Sub=a[i][j]-b[i][j];
               System.out.print(Sub+" "); 
            }
            System.out.println();
        }
        System.out.println("multiplication of two matrix :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]*b[i][j];
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/
import java.util.Scanner;
public class Array
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int i,j;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        System.out.println("Array 3-D Matrix :");
        System.out.println("enter Elements :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("First array elements :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
        {
            System.out.print(b[i][j]+" ");
        }
        System.out.println();
        }
        System.out.println("second Array matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println("Addition of two matrixes:");
        System.out.println("--------------------");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        System.out.println("---------------");
        System.out.println("Substraction of two matrixes:");
        System.out.println("--------------------");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println("Multipliction of two matrixes:");
        System.out.println("--------------------");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println("Dividion of two matrixes:");
        System.out.println("--------------------");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]/b[i][j];
                System.out.print(c[i][j]+" ");
            } 
            System.out.println();
        }
    }
}