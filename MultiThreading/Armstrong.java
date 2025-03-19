import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        System.out.println("Java program for armstrong numbers :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check the given number is armstrong number or not : ");
        int n=sc.nextInt();
        int m=n;
        int j=0;
        while(n>0)
        {
            int x=n%10;
            n=n/10;
            j=j+x*x*x;
        }
        if(j==m)
        {
            System.out.println("Given number is an  armstrong number :");
        }
        else
        {
            System.out.println("It is not an armstrong number :");
        }

    }
}