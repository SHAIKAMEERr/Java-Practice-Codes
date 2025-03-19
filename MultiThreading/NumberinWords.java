import java.util.*;
class NumberinWords
{
    public static void main(String args[])
    {
        System.out.println("Java program to convert number in words");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int rev=0;
        int x;
        while(n>0)
        {
            int i=n%10;
            rev=rev*10+i;
            n=n/10;
            x=rev%10;
            rev=rev/10;
        }
        System.out.println(rev);
    }
}