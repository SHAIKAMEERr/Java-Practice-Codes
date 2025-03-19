import java.util.Scanner;
public class Arrayone
{
    public static void main(String []args)
    {
        System.out.println("2-D Arrays");
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.of rows : ");
        int rows=s.nextInt();
        System.out.println("enter no of columns : ");
        int columns=s.nextInt();
        int arr[][]=new int[rows][columns];
        System.out.println("enter elements in the array : ");
        for( int i=0;i<rows;i++)
        {
            for( int j=0;j<columns;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }


        System.out.println("2-D Array is");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}