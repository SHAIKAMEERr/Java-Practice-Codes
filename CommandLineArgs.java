package JavaPrograms.JavaPractice;
import java.lang.String;
class CommandLineArgs
{
public static void main(String args[])
{
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("enter name ");
    String name=sc.next();
    System.out.println("My name is : "+name);
}
}