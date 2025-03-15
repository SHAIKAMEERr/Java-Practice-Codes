public class PrintNumber
{
    public void printOneToN(int i,int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(i+" ");
        printOneToN(i+1,n-1);
    }
    public void printNToOne(int n)
    {
        if(n<=0)
        {
            return;
        }
        System.out.print(n+" ");
        printNToOne(n-1);
    }
    public void printUsingBacktracking(int n)
    {
        if(n==0)
        {
            return ;
        }
        printUsingBacktracking(n-1);
        System.out.print(n+" ");
    }
    public void printBothOrders(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        printBothOrders(n-1);
        System.out.print(n+" ");
    }
}
