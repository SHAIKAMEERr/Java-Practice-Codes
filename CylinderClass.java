import java.util.Scanner;
class CylinderClass
{
    public static void main(String[] args)
    {
        Cylinder cl=new Cylinder();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius of Cylinder :");
        cl.radius=sc.nextDouble();
        System.out.print("Enter Height of the Cylinder : ");
        cl.height=sc.nextDouble();
        System.out.println("LidArea of the Cylinder = "+cl.lidArea());
        System.out.println("Surface of the Cylinder = "+cl.surfaceArea());
        System.out.println("Volume of the Cylinder = "+cl.volume());
        System.out.println("Circurmfirance of a Cylinder = "+cl.Cirumfirence());
    }
}
class Cylinder
{
    public double radius;
    public double height;
    public double lidArea()
    {
        double baseArea=Math.PI*radius*radius; 
        return baseArea;  
    }
    public double surfaceArea()
    {
        double surface=2*Math.PI*radius*height+2*Math.PI*radius*height;
        return surface;
    }
    public double volume()
    {
        double volumeOfCylinder=2*Math.PI*radius*radius*height;
        return volumeOfCylinder;
    }
    public double Cirumfirence()
    {
        double circumfiranceOfCircle=2*Math.PI*radius;
        return circumfiranceOfCircle;
    }
}