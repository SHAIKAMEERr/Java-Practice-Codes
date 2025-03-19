class FinallyPractice
{
    public static void main(String[] args)
    {
        Finally.arrayIndex(10);
    }
}
class Finally
{
    static void arrayIndex(int num)
    {
        int[] arr={10,20,30,40};
        try
        {
            int x=arr[10];
            Syystem.out.println(x);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Program gets completed");
        }
    }
}

