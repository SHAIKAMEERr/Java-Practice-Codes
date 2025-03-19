import java.util.*;
class Practicefour
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Your choice :");
        System.out.println("1. Get bit");
        System.out.println("2. Set bit");
        System.out.println("3. Clear bit");
        System.out.println("4. Update bit");
        int choice=sc.nextInt();
        System.out.println("enter value of n : ");
        int n=sc.nextInt();//taking input from the user
        System.out.println("Enter position which you want to check : ");
        int pos=sc.nextInt();
        int mask=1<<pos;//creating mask for the given input
        int a=~(mask);
        if(choice==1)
        {
            System.out.println("Get Bit :");
            int getBit=n & mask;
            if(getBit==0)
            {
                System.out.println("GBit is OFF : "+getBit);
            }
            else
            {
                System.out.println("Bit is ON :"+getBit);
            }
        }
        else if(choice==2)
        {
            System.out.println("Set Bit : ");
            int setBit=mask | n;
            if(setBit==0)
            {
                System.out.println("Bit is OFF is : "+setBit);
            }
            else
            {
                System.out.println("Bit is ON : "+setBit);
            }
        }
        else if(choice==3)
        {
            System.out.println("clear bit :");
            int clearBit=a & n;
            if(clearBit==0)
            {
                System.out.println("Bit is OFF  : "+clearBit);
            }
            else
            {
                System.out.println("Bit is ON : "+clearBit);
            }
        }
        else if(choice==4)
        {
            System.out.println("Update bit :");
            System.out.println("choose which operation do you want to perform : ");
            System.out.println("1. To Update 0 to 1 ");
            System.out.println("2. To Update 1 to 0");
            int s=sc.nextInt();
            if(s==1)
            {
                System.out.println("Convert bit from zero to 1 : ");
                int z=mask | n;
                System.out.println("Updated bit is :"+z);
            }
            else
            {
                System.out.println("Convert bit from One to Zero :");
                int x=mask &n;
                System.out.println("Bit is updated to Zero "+x);
            }
        
        }
       
    }
}