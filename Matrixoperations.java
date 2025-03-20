import java.util.*;
class Matrixoperations
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Java Program to Practice Arrays :");
        System.out.print("Enter the row Size :");
        int row=sc.nextInt();
        System.out.print("enter the size of the column :");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the elements in the first array :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int a[]:arr)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the elements in the second array :");
        int arr2[][]=new int[row][col];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int x[]:arr2)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        int sum[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum of two arrays :");
        for(int a[]:sum)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
        int mul[][]=new int[row][col];
        System.out.println("Multiplication of two arrays :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mul[i][j]=arr[i][j]*arr2[i][j];
            }
        }
        for(int x[]:mul)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of matrix :");
        int max[][]=new int[row][col];
        for(int i=0;i<max.length;i++)
        {
            for(int j=0;j<max[0].length;j++)
            {
                max[i][j]=0;
                for(int k=0;k<max.length;k++)
                {
                    max[i][j]=max[i][j]+arr[i][k]*arr2[k][j];
                }
            }
        }
        for(int x[]:max)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}