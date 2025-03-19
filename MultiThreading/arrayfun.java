import java.util.Scanner;
public class arrayfun {
    public static void main(String []args)
    {
        System.out.println("One Dimensional Arrays");
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of rows");
        int row=s.nextInt();
        int arr[]=new int[row];
        System.out.println("enter elements :");
        for(int i=0;i<row;i++)
        {
            arr[i]=s.nextInt();
        }
        int max =Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;
        System.out.println("1D-array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                min=arr[i];
            }
            System.out.println("maximum number is : "+max);
            System.out.println("minimum value in the array is : "+min);
        }
    }
}
