import java.util.*;
public class Variables
{
public static void main(String args[])
{
int a;
String b;
short c;
float d;
long e;
double g;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Integer");
a=sc.nextInt();
System.out.println("Enter a Char");
b=sc.next();
System.out.println("Enter a Short");
c=sc.nextShort();
System.out.println("Enter a float");
d=sc.nextFloat();
System.out.println("Enter a long");
e=sc.nextLong();
System.out.println("Enter a Double");
g=sc.nextDouble();
System.out.println(a+b+c+d+e+g);
}
}

