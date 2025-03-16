import java.util.*;
class Arrayinsert
{
    public static void main(String args[])
    {
        System.out.print("Java program to copy array " );
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array : ");
        int size=sc.nextInt();
        System.out.println("enter the elements in an array : ");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Length of an array : "+arr.length);
        /* Copy the elements in an array
        int arr1[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
        System.out.println();
        for(int x:arr1)
        {
            System.out.print(x+" ");
        } 


        Reversing an array
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }*/

        //Increasing the size of an array
        int arr1[]=new int[2*size];
        for(int i=0;i<size;i++)
        {
            arr1[i]=arr[i];
        }
        arr=arr1;
        arr1=null;
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Length of an array : "+arr.length);
    }
}