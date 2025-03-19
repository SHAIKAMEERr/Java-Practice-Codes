import java.util.*;
class CHoneI
{
    public static void main(String []args)

    {
        System.out.println("Java Program For BIT MASKING ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of N : ");
        int bit=sc.nextInt();
        System.out.println("Enter the value of pos : ");
        int pos=sc.nextInt();
        int mask=1<<pos;
        if((mask&bit) ==0)
        {
            System.out.println("Bit is OFF !!!");
        }
        else
        {
        System.out.println("Bit is ON ");
        }
    } 
}