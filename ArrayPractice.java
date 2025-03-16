import java.util.*;
class ArrayPractice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Java program to use methods in an array ");
        System.out.print("Enter the size of an array :");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements in an array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the the element which you want to delete :");
        int del=sc.nextInt();
        int e=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==del)
            {
                e=i;
            }
        }
        System.out.println(e);
        for(int i=size-1;i>e;i--)
        {
            arr[i]=arr[i-1];
        }
        for(int i:arr)
        {
            System.out.print(i+ " ");
        }
        
        
        
        /*System.out.println("Enter the new value which you want to insert :");
        int x=sc.nextInt();
        System.out.println("enter the index value where you want to insert new element : ");
        int z=sc.nextInt();
        for(int i=size;i>z;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[z]=x;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }*/
       
       
       
       
       
       
       
       
       
       
        /* int temp=arr.length;
        for(int i=arr.length;i<=0;i++)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(i+" ");
        }
        /*int arr2[]=new int[8];
        int arr3[]=new int[11];
        java.util.Arrays.sort(arr);
        System.arraycopy(arr,2,arr2,0,8);
        arr3=java.util.Arrays.copyOfRange(arr,1,11);
        for(int i:arr2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arr3)
        {
            System.out.print(i+" ");
        }
        System.out.print(Arrays.toString(arr));*/
    }
}