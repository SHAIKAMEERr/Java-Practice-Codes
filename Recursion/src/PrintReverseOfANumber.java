public class PrintReverseOfANumber
{
    int sum=0;
    public void rev(int n)
    {
        if(n<=0)
        {
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
    }
    public int rev1(int n)
    {
        int x=(int)Math.log10(n)+1;
        return helper(n,x);
    }
    public int helper(int n,int digits)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
        return rem+(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
