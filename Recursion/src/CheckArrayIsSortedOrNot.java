public class CheckArrayIsSortedOrNot
{
    public boolean sorted(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
    public boolean element(int arr[],int n,int i)
    {
        if(i>=arr.length)
        {
            return false;
        }
        return arr[i]==n || element(arr,n,i+1);
    }
    public int find(int arr[],int element,int index)
    {
        if(index>=arr.length)
        {
            return -1;
        }
        else if(arr[index] == element)
        {
            return index;
        }
        return find(arr,element,index+1);
    }
    public int findElement(int arr[],int target,int index)
    {
        if(index<0)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return findElement(arr,target,index-1);
    }
}
