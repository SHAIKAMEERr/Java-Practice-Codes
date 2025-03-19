import java.util.*;
class Calc
{
public static void main(String args[])
{
System.out.println("Java Program For Calculator");
Scanner sc=new Scanner(System.in);
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("5.ModuloDivision");
System.out.println("6.SquareRoot");
System.out.println("Choose Operator which you want to perform : ");
int n=sc.nextInt();
if(n==1)
{
System.out.print("Enter N1 : ");
int n1=sc.nextInt();
System.out.println("Enter N2 : ");
int n2=sc.nextInt();
int Addition=n1+n2;
System.out.println("Addition of N1"+n1+"And"+n2+"are : "+Addition);
}
else if(n==2)
{
System.out.print("Enter N1 : ");
int n1=sc.nextInt();
System.out.println("Enter N2 : ");
int n2=sc.nextInt();
int Subtraction=n1-n2;
System.out.println("Subtraction of N1"+n1+"And"+n2+"are : "+Subtraction);
}
else if(n==3)
{
System.out.print("Enter N1 : ");
int n1=sc.nextInt();
System.out.println("Enter N2 : ");
int n2=sc.nextInt();
int Multiplication=n1*n2;
System.out.println("Multiplication of N1"+n1+"And"+n2+"are : "+Multiplication);
}
else if(n==4)
{
System.out.print("Enter N1 : ");
int n1=sc.nextInt();
System.out.println("Enter N2 : ");
int n2=sc.nextInt();
int Division=n1/n2;
System.out.println("Division of N1"+n1+"And"+n2+"are : "+Division);
}
else if(n==5)
{
System.out.print("Enter N1 : ");
int n1=sc.nextInt();
System.out.println("Enter N2 : ");
int n2=sc.nextInt();
int ModuloDivision=n1%n2;
System.out.println("ModuloDivision of N1"+n1+"And"+n2+"are : "+ModuloDivision);
}
else if(n==6)
{
System.out.print("Enter N1 : ");
int n1=sc.nextInt();
System.out.println("Enter N2 : ");
int n2=sc.nextInt();
int SquareRoot=(n1+n2)*(n1+n2);
System.out.println("SquareRoot of N1"+n1+"And"+n2+"are : "+SquareRoot);
}
else
{
System.out.println("You choose invalid operator ");
}
}
}

