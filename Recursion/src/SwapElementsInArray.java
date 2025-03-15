public class SwapElementsInArray
{
    public int swap(int arr[],int n)
    {
        if(n==0)
        {
            return arr[0];
        }
        return arr[n-1];
    }
}
