import java.util.Scanner;
class MethodPracticeFour
{
    static int gcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else if(a<b)
            {
                b=b-a;
            }
            else if(a==b)
            {
                return a;
            }
        }
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of A :");
        int a=sc.nextInt();
        System.out.print("Enter the value of B :");
        int b=sc.nextInt();
        System.out.println("GCD Of "+a+" & "+b+" = "+gcd(a,b));
    }
}