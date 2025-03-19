import java.util.*;
class Clearbit
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        System.out.println("Enter position value : ");
        int i=sc.nextInt();
        int pos=(1<<i);
        int Mask=~(pos);
        System.out.println("clear bit is : "+(n & Mask));
        

    } 
}