import java.util.*;
class Twodimensionalarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of a row :");
        int row=sc.nextInt();
        System.out.print("enter the size of an Column :");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        int arr1[][]=new int[row][col];
        System.out.println("Enter the elements in the first  array : ");
        int sum[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("{ ");
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("}");
        }
        System.out.println("Enter the elements in an second array :");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int a[]:arr1)
        {
            System.out.print("{ ");
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println("}");
        }
        for(int i=0;i<row-1;i++)
        {
            for(int j=0;j<col-1;j++)
            {
                sum[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for(int x[]:sum)
        {
            System.out.print("{ ");
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("}");
        }
        /*for(int i=0;i<sum.length;i++)
        {
            for(int j=0;j<sum[i].length;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}