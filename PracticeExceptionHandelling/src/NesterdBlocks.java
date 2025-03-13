import java.util.Scanner;

public class NesterdBlocks
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array : ");
        int size=sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the index number of the which you want to divide :");
        int div=sc.nextInt();
        System.out.println("Enter a index number whom you want to divide ");
        int dor=sc.nextInt();
        try
        {
            try
            {
                int c=arr[div]/arr[dor];
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            System.out.println("enter the index of an array ");
            int idx=sc.nextInt();
            System.out.println(arr[idx]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally {
            sc.close();
        }
    }
}
