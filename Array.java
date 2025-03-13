import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}