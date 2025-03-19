import java.util.Scanner;
class PracticeMethodsSeven
{
    static int reverse(int n)
    {
        int x=0;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            x=x*10+rem;
        }
        return x;
    }
    static int[] reverse(int a[],int size)
    {
        System.out.println("Reverse of an array :");
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        return a;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number : ");
        System.out.println("1. To reverse a Number ");
        System.out.println("2. To reverse an array ");
        int ch=s.nextInt();
        if(ch==1)
        {
            System.out.print("Enter a number :");
            int n=s.nextInt();
            System.out.println("Reverse of a given number :"+reverse(n));
        }
        else if(ch==2)
        {
            System.out.print("Enter the size of an array : ");
            int size=s.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter elements in an array :");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=s.nextInt();
            }
            System.out.print("Given Array :");
            for(int x: arr)
            {
            System.out.print(x);
            }
            System.out.println();
            reverse(arr,size);
        }

    }
}