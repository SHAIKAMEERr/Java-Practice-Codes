import java.util.Scanner;
class Arrayone
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of an array : ");
       int size=sc.nextInt();
       int arr[]=new int[size];
       int max1=0;
       int max2=arr[0];
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       }
       for(int x: arr)
       {
        if(x>max1)
        {
            x=max1;
            max1=max2;
        }
        else if(x>max2)
        {
            max1=max2;
        }
       }
       System.out.println(max1);
       System.out.println(max2);
       
       
       
       
       
       
       
        /*  Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int a:arr)
        {
            if(a>max)
            {
                max=a;
            }
        }    
        System.out.print("Largest number is : "+max);*/
        
        
        
        
        
        
        
        /*String str[]=new String[size];
        for(int i=0;i<str.length;i++)
        {
            str[i]=sc.next();
        }
        for(int i=0;i<str.length;i++)
        {
            System.out.print(str[i]);
        }*/              
        
        
        
        
        
        /*int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        } 
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]);
        }*/




    }
}