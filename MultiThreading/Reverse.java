import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        System.out.println("Java program for reversing a  number : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int i=sc.nextInt();
        int rev=0;
        while(i>0)
        {
            int n=i%10;
            i=i/10;
            rev=rev*10+n;
        }
        System.out.println("Reverse of the given number is : "+rev);
    }
}