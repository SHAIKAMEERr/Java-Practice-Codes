import java.util.*;
public class Cuboid
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Java program for Cuboid : ");
System.out.println("Enter Length : ");
int l=sc.nextInt();
System.out.println("Enter Bridth : ");
int b=sc.nextInt();
System.out.println("Enter Height : ");
int h=sc.nextInt();
int sides=b*h;
int up=l*h;
int front=h*l;
int volume=l*b*h;
int totalArea=2*sides*front*up;
System.out.println("Area of sides : "+sides);
System.out.println("Area of front/back : "+front);
System.out.println("Area of up/down : "+up);
System.out.println("Volume of cuboid : "+volume);
System.out.println("Total area : "+totalArea);
}
}