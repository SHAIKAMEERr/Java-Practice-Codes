public class Factorial
{
    public void factorialWithParameters(int n,int i)
    {
        if(n<=0)
        {
            System.out.println(i);
            return;
        }
        factorialWithParameters(n-1,i*n);
    }
    public int factorialWithFunction(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*factorialWithFunction(n-1);
    }
    public int sumOfDigits(int n)
    {
        if(n<1)
        {
            return n;
        }
        return n+sumOfDigits(n-1);
    }
}
