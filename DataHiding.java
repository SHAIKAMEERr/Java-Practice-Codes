import java.util.Scanner;
class DataHiding
{
    public static void main(String[] args)
    {
        System.out.println("Rectrangle Formulas");
        //System.out.println("Enter the Length of the Rectrangle: ");
        //System.out.println("Enter the breadth of the Rectrangle: ");
        Hiding h=new Hiding();
        h.setLength(10.5);
        h.setBreadth(5.5);
        System.out.println("Area Of the Rectrangle = "+h.AreaOfRectrangle());
        System.out.println("Perimeter of the Rectrangle = "+h.PerimeterOfRectrangle());
        System.out.println(h.getBreadth());
        System.out.println(h.getLength());
    }
}
class Hiding
{
    private double length;
    private double breadth;
    public void setLength(double l)
    {
        if(l>=0)
        {
            length=l;
        }
        else
        {
            l=0;
        }
    }
    public void setBreadth(double b)
    {
        if(b>=0)
        {
            breadth=b;
        }
        else
        {
            b=0;
        }
    }
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public double AreaOfRectrangle()
    {
        double area=length*breadth;
        return area;
    }
    public double PerimeterOfRectrangle()
    {
        double perimeter=2*(length*breadth);
        return perimeter;
    }
}