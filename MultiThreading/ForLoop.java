import java.util.*;
class ForLoop
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N :");
        int n=sc.nextInt();
        for(int i=1;i<=20;i++)
        {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}