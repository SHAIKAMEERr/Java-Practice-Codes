import java.util.*;
public class Quadratic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Quadratic equations : ");
System.out.println("Enter a : ");
int a=sc.nextInt();
System.out.println("Enter b :");
int b=sc.nextInt();
System.out.println("Enter c :");
int c=sc.nextInt();
System.out.println("Enter x : ");
int x=sc.nextInt();
float QuadraticEquation =a*(x*x)+(b*x)+c;
System.out.println("Quadratic equation of the Given data is  : "+QuadraticEquation);
double r1=((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
double r2=((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
System.out.println("Roots of the given values are : "+r1);
System.out.println("Roots of the given values are : "+r2);
}
}
