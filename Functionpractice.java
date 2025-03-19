import java.util.*;
class Functionpractice
{
    public static void primeOrNot(int a)
    {
        for(int i=2;i<=a;i++)
        {
            if(a%i!=0)
            {
                System.out.println("Given number is a Prime Number ");
                break;
            }
            else
            {
                System.out.println("Given number is not a Prime Number ");
                break;
            }
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number to check given number is prime or not : ");
        int a=sc.nextInt();
        primeOrNot(a);
    }
}