public class MethodReference
{
    public MethodReference(String str)
    {
        System.out.println("Constructor of MethodReference");
        System.out.println(str.toUpperCase());
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
    public void multiplesOfTwo(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                try
                {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
    public MethodReference(int a,int b)
    {
        int adds=a+b;
        System.out.println("Constructor "+adds);
    }
    public static void printAlphabets()
    {
        int n=65;
        for(int i=n;i<=90;i++)
        {
            System.out.print((char)i+" ");
        }
    }
    public static int add(int a,int b)
    {
        return a+b;
    }
    public void demo()
    {
        int x=10;
        for(int i=0;i<=x;i++)
        {
            try
            {
                System.out.print(i+" ");
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
