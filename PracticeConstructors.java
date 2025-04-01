import java.util.Scanner;
class RectrangleConstructor
{
    private int leangth;
    private int breadth;
    public int RectrangleArea()
    {
        return leangth*breadth;
    }
    public int RectranglePerimeter()
    {
        return 2*(leangth+breadth);
    }
    public RectrangleConstructor()
    {
        leangth=10;
        breadth=20;
    }
    public RectrangleConstructor(int l,int b)
    {
        leangth=l;
        breadth=b;
    }
}
class PracticeConstructors
{
    public static void main(String[] args)
    {
        RectrangleConstructor pc=new RectrangleConstructor(5,10);
        System.out.println("Area = "+pc.RectrangleArea());
        System.out.println("Perimeter = "+pc.RectranglePerimeter());
    }
}