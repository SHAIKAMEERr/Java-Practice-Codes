import java.util.*;
class Sorting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sorting of an array :");
        System.out.print("Enter the size of an array :");
        int size=sc.nextInt();
        String arr[]=new String[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextLine();
        }
        java.util.Arrays.sort(arr);
        for(String x:arr)
        {
            System.out.print(x+" ");
        }
    }
}