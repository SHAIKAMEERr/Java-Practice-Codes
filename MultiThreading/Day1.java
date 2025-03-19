import java.util.*;
class Day1
{
public static void main(String arg[])
{
Scanner p=new Scanner(System.in);
System.out.println("Enter two numbers :");
int x=p.nextInt();
int y=p.nextInt();
int z=x+y;
System.out.println("Sum of the given two numbers are :"+z);
System.out.println("enter two numbers to divide :");
float a=p.nextFloat();
float b=p.nextFloat();
float c=a/b;
System.out.println("Answer for this division is :"+c);
System.out.println("For double");
double P=p.nextDouble();
double q=p.nextDouble();
double r=P*q;
System.out.println("MUltiplications of the given number is :"+r);
}
}