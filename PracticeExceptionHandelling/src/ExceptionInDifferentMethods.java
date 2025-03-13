public class ExceptionInDifferentMethods
{
    public static int div(int a,int b)
    {
        return a/b;
    }
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static void meth1(int a,int b)
    {
        System.out.println(add(a,b));
    }
    public static void meth2(int a,int b)
    {
        mul(a,b);
    }
    public static void meth3(int a,int b)
    {
        try
        {
            System.out.println(div(a,b));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        meth3(10,0);
    }
}
