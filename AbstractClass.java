class AbstractClass 
{
    public static void main(String[] args)
    {
        Shape s=new Circle();
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
abstract class Shape
{
    Shape()
    {
        System.out.println("Shape Doesnot have its own methods or formula");
    }
    abstract double perimeter();
    abstract  double area();
}
class Circle extends Shape
{
    float radius;
    @Override
    double perimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    double area()
    {
        return Math.PI*radius*radius;
    }
    Circle()
    {
        radius=15;
    }
    Circle(float radius)
    {
        this.radius=radius;
    }
}
class Rectrangle extends Shape
{
    float length;
    float breadth;
    double perimeter()
    {
        return 2*length*breadth;
    }
    double area()
    {
        return length*breadth;
    }
    boolean isSquare()
    {
        return length==breadth;
    }
    Rectrangle()
    {
        length=10;
        breadth=10;
    }
    Rectrangle(float length,float breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}