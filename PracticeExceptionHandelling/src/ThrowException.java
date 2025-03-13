class ThrowException
{
    public static void main(String[] args)
    {
        Throws.Index(5,20);
    }
}
class Throws
{
    public static void Index(int length,int value)throws ArrayIndexOutOfBoundsException
    {
        int arr[]=new int[length];
        int x=arr[value];
        throw new ArrayIndexOutOfBoundsException();

    }
}