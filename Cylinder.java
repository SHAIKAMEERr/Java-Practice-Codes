import java.util.Scanner;
class Cylinder
{
    double radius;
    double height;
    double surfaceOfCylinder()
    {
        double surface=2*Math.PI*radius*height;
        return surface;
    }
    double volumeOfCylinder()
    {
        double volume=2*Math.PI*radius*radius*height;
        return volume;
    }
    double areaOfCylinder()
    {
        double area=surfaceOfCylinder()*2*Math.PI*radius*radius;
        return area;
    }
    Cylinder()
    {
        radius=5.5;
        height=7.5;
    }
    Cylinder(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
}
class Practice
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Cylinder cly=new Cylinder();
        Cylinder cl=new Cylinder(5.5,10.5);
        System.out.println("Area of Cylinder = "+cl.areaOfCylinder());
        System.out.println("Volume of Cylinder = "+cl.volumeOfCylinder());
        System.out.println("Surface of Cylinder = "+cl.surfaceOfCylinder());
        System.out.println("Area of Cylinder = "+cly.areaOfCylinder());
        System.out.println("Volume of Cylinder = "+cly.volumeOfCylinder());
        System.out.println("Surface of Cylinder = "+cly.surfaceOfCylinder());
    }
}