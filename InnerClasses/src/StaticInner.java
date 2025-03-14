class StaticInner
{
    static int  a=20;
    int b=20;
    static class Inner
    {
        static int c=20;
        static void staticSum()
        {
            System.out.println(a+c);
        }
    }
}
