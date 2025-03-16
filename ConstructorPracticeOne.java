import java.util.Scanner;
class ConstructorPracticeOne
{
    public static void main(String[] args)
    {
        CylinderCon cl=new CylinderCon(5,5);
        System.out.println("Volume = "+cl.Lidarea());
        System.out.println("Lid Area = "+cl.Lidarea());
        System.out.println("Circumference = "+cl.CirumfirenceOfCylinder());
    }
}
class CylinderCon
{
    private double radius;
    private double height;
    public double Lidarea()
    {
        return Math.PI*radius*radius;
    }
    public double volume()
    {
        return 2*Lidarea()*height;
    }
    public double CirumfirenceOfCylinder()
    {
        return 2*Math.PI*radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        radius=r;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double h)
    {
        height=h;
    }
    public CylinderCon()
    {
        height=10;
        radius=20;
    }
    public CylinderCon(double h, double r)
    {
        radius=r;
        height=h;
    }
}