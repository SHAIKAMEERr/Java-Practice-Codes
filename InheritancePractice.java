/*import java.util.Scanner;
class InheritancePractice
{
    public static void main(String[] args)
    {
        CirclePractice cl=new CirclePractice();
        CirclePractice cl1=new CirclePractice(10.5);
        CylinderPractice cyl1=new CylinderPractice(10.5);
        CylinderPractice cyl=new CylinderPractice();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius : ");
        cl.radius=sc.nextDouble();
        System.out.print("Enter Height : ");
        cyl.height=sc.nextDouble();
        System.out.println(cyl.area());
        System.out.println("Area of a Circle : "+cl.area());
        System.out.println("Perimeter of a Circle : "+cl.perimeter());
        System.out.println("Circurmferance of a Circle : "+cl.circurmference());
        System.out.println("Volume of Cylinder : "+cyl.volume());
        System.out.println("Base area of Cylinder : "+cyl.baseArea());
        System.out.println("Surface of a Cylinder : "+cyl.surface());
        System.out.println("_______________________________");
        System.out.println("Constructor with Paremeters ");
        System.out.println("Area of a Circle : "+cl1.area());
        System.out.println("Perimeter of a Circle : "+cl1.perimeter());
        System.out.println("Circurmferance of a Circle : "+cl1.circurmference());
        System.out.println("Volume of Cylinder : "+cyl1.volume());
        System.out.println("Base area of Cylinder : "+cyl1.baseArea());
        System.out.println("Surface of a Cylinder : "+cyl1.surface());

    }
}
class CirclePractice
{
    double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return Math.PI*radius;
    }
    public double circurmference()
    {
        return perimeter();
    }
    CirclePractice()
    {
        radius=10.5;
    }
    CirclePractice(double radius)
    {
        this.radius=radius;
    }
}
class CylinderPractice extends CirclePractice
{
    double height;
    double volume()
    {
        return area()*height;
    }
    double surface()
    {
        return perimeter()*height+area();
    }
    double baseArea()
    {
        return perimeter();
    }
    CylinderPractice(double height)
    {
        this.height=height;
    }
    CylinderPractice()
    {
        height=15.5;
    }
}*/

import java.util.Scanner;
class Circlep
{
    double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    double circurmferance()
    {
        return Math.PI*radius;
    }
    Circlep()
    {
        radius=5.5f;
    }
    Circlep(double radius)
    {
        this.radius=radius;
    }
}
class Cylinderp extends Circlep
{
    double height;
    double surface()
    {
        return circurmferance()*height;
    }
    double volume()
    {
        return 2*area()*height;
    }
    Cylinderp()
    {
        radius=7.5;
        height=10.5;
    }
    Cylinderp(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
}
class InheritancePractice
    {
        public static void main(String[] args)
        {
            Circlep cl=new Circlep();
            Cylinderp cyl=new Cylinderp();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Radius : ");
            cl.radius=sc.nextDouble();
            System.out.print("Enter the height : ");
            cyl.height=sc.nextDouble();
            System.out.println("Area = "+cl.area());
            System.out.println("Circurmferance : "+cl.circurmferance());
            System.out.println("Surface : "+cyl.surface());
            System.out.println("volume  : "+cyl.volume());
        }
    }