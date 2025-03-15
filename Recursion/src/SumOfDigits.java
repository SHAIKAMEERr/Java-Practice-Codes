public class SumOfDigits
{
    public int sum(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        int rem=n%10;
        n=n/10;
        return rem+sum(n);
    }
}
