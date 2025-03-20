import java.util.Scanner;
class MethodPracticeFive
{
    static int maxElement(int a[])
    {
        int m=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>=m)
            {
                m=a[i];
            }
        }
        return m;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter elements in an array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x= maxElement(arr);
        System.out.println("Greatest element in an given array : "+maxElement(arr));
    }
}