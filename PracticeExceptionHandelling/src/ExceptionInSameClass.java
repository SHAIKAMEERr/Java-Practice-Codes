class ExceptionInSameClass
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the value of A :");
        int a=sc.nextInt();
        System.out.println("Enter the value of B :");
        int b=sc.nextInt();
        System.out.print("Enter the size of an array :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        try
        {
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        try
        {
            int getElement=arr[10];
            System.out.println(getElement);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            sc.close();
        }
    }
}
