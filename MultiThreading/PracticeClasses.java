import java.util.Scanner;
class PracticeClasses
{
    public static void main(String[] args)
    {
        Circle cl=new Circle();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of the radius : ");
        cl.radius=sc.nextDouble();
        System.out.println("Area Of The Circle = "+cl.areaOfCircle());
        System.out.println("Perimeter Of Circle = "+cl.perimeter());
        System.out.println("Circurmference of the circle = "+cl.circurmference());
    }
}
class Circle
{
    double radius;
    double height;
    double areaOfCircle()
    {
        return Math.PI*radius*radius;
    }
    double perimeter()
    {
        return 2*Math.PI*radius;
    }
    double circurmference()
    {
        return Math.PI*radius;
    }
}