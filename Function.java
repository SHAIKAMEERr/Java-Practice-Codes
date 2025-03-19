import java.util.*;
class Fibbonacci_series
{
    static int Fibbonacci(int n)
    {
        int fibbonacc;
        if(n==0 || n==1)
        return 1;
        else
        {
            fibbonacc=Fibbonacci(n-1)+Fibbonacci(n-2);
        }
        return fibbonacc;
    }
}
public class Function
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=fibbonacci(n);
        System.out.println("Fibbonacci of "+n+" is : "+x);
    }

    
}