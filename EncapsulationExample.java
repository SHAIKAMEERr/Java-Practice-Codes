public class EncapsulationExample 
{
    public static void main(String[] args)
    {
        Sum s=new Sum();
        s.setVal1(10);
        System.out.println(s.getVal1());

    }
}
class Sum
{
    private int a;
    private int b;
    public void setVal1(int a)
    {
        this.a=a;
    }
    public int getVal1()
    {
        return a;
    }
    public void setVal2(int b)
    {
        this.b=b;
    }
    public int getVal2()
    {
        return b;
    }
}
