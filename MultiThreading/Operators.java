import java.lang.*;
import java.util.*;
public class Operators
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Area of Trinagle : ");
System.out.println("Length of the triangle : ");
int a=sc.nextInt();
System.out.println("Enter bridth of the triangle : ");
int b=sc.nextInt();
System.out.println("Enter height of the triangle : ");
int c=sc.nextInt();
int AreaOfTriangle=(a*b)/2;
int s =(a*b*c)/2;
double Radius=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of triangle is : "+AreaOfTriangle);
System.out.println("Area of the triangle by sides : "+s);
System.out.println("Sides of the squares are : "+Radius);

}
}