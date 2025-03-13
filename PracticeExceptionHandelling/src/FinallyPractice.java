class FinallyPractice
{
    static void arrayIndex(int num)
    {
        int[] arr={10,20,30,40};
        try
        {
            int x=arr[10];
            System.out.println(x);
        }
        finally
        {
            System.out.println("Program gets completed");
        }
    }
    public static void main(String[] args)
    {

        arrayIndex(10);
    }
}
//class Finally
//{
//
//}

