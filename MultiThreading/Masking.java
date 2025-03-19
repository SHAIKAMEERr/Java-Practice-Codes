import java.util.*;
class Masking
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of A : ");
        int a=sc.nextInt();
        System.out.println("enter the Value of the position :");
        int i=sc.nextInt();
        int Getmask=1<<i;
        if((a & Getmask)==0)
        {
        System.out.println("bit is off");
        }
        else
        {
            System.out.println("bit is on");
        }
    }
}