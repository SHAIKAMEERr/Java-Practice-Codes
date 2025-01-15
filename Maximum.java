import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements in an array ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        int max,max2;
        max=max2=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                max=max2;
            }
            if(max2<arr[i])
            {
                max2=arr[i];
            }
        }
        System.out.println("Maximum element in an array : "+max);
        System.out.println("Second largest element in an array :"+max2);
    }
}