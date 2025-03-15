import java.util.Scanner;
public class MathFun {
    public static void main(String args[])
    {
        System.out.println("Program for Quadratic equation : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of A : ");
        int a=sc.nextInt();
        System.out.println("Enter value of B : ");
        int b=sc.nextInt();
        System.out.println("Enter value of C : ");
        int c=sc.nextInt();
        double r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        double r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Sqrts are " +r1+"AND"+r2);
        
        
        
    }
}