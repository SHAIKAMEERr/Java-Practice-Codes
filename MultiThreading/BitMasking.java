import java.util.*;
class BitMasking
{
    public static void main(String []args)
    {
        System.out.println("Bit Masking...!!!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of A Bit : ");
        int bit=sc.nextInt();
        System.out.println("Enter Position which you wants to check BIT : ");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        System.out.println("Choose the operation which you want to perform : ");
        System.out.println("1. Get Bit ");
        System.out.println("2. Set Bit");
        System.out.println("3. Clear Bit");
        System.out.println("4. Update Bit");
        int n=sc.nextInt();
        if(n==1)
        {
            if((bit&bitMask)==0)
            {
                System.out.println("Bit is OFF..!!"+(bit&bitMask));
            }
            else
            {
                System.out.println("Bit is ON..!!"+(bit&bitMask));
            }
        }
        else if(n==2)
        {
            if((bit|bitMask)==0)
            {
                System.out.println("Bit is OFF..!!");
            }
            else
            {
                System.out.println("Bit is ON..!!");
            }
        }
        else if(n==3)
        {
            int x=~(bitMask);
            if((bit & x)==0)
            {
                System.out.println("Bit is OFF..!!");
            }
            else
            {
                System.out.println("Bit is ON..!!  "+(bit & x));
            }
        }
        else if(n==4)
        {
            System.out.println("Enter operation which you wants to perform ..!!");
            System.out.println("1. Get Bit");
            System.out.println("2. Clear Bit");
            int a=sc.nextInt();
            if(a==1)
            {
                if((bit|bitMask)==0)
                {
                    System.out.println("Bit is OFF..!!");
                }
                else
                {
                    System.out.println("Bit is ON..!!");
                }
            }
            else if(a==2)
            {
                int x=~(bitMask);
                if((bit & x)==0)
                {
                    System.out.println("Bit is OFF..!!");
                }
                else
                {
                    System.out.println("Bit is ON..!!");
                }
            }
        }
        else
        {
            System.out.println("Wrong Choice....!!!");
        }
    }
}