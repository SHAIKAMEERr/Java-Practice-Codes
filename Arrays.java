import java.util.List;
import java.util.Scanner;
public class Arrays {
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
                System.out.print(a[i][j]+" ");
         }
            System.out.print("");
}
        for(int i=0;i<3;i++)
{
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
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
                c[i][j]=a[i][j]-b[i][j];
               System.out.print(c[i][j]+" "); 
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

    public static char[] toString(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    public static List<Integer> asList(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }
}
