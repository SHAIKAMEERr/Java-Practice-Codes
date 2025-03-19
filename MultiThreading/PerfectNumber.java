import java.util.*;
class PerfectNumber
{
    public static void main(String args[])
    {
        System.out.println("Java program to find the given number is perfect number or not : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int j=0;
        for(int i=1;i<n;i++)
        {
           if(n%i==0)
           {
            System.out.print(i+" ");
           }
        }
    }
}