import java.util.Scanner;
class MethodPracticeSix
{
    static int area(int l,int b)
    {
        int areaOfRectangle=l*b;
        return areaOfRectangle;
    }
    static float area(float l,float b)
    {
        float areaOfRectangle=l*b;
        return areaOfRectangle;
    }
    static int area(int r)
    {
        int circle= (int)(Math.PI*r*r);
        return circle;
    }
    static double area(double r)
    {
        double circle=Math.PI*r*r;
        return circle;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a task number which you want to perform :");
        System.out.println("1. Area of Rectangle ");
        System.out.println("2. Area of Circle ");
        int choice =sc.nextInt();
        if(choice ==1)
        {
            System.out.print("Enter the value of Length : ");
            int length=sc.nextInt();
            System.out.print("Enter the value of Bridth : ");
            int bridth=sc.nextInt();
            System.out.println(area(length,bridth));
        }
        else if(choice==2)
        {
            System.out.print("Enter the radius of a circle : ");
            float radius=sc.nextFloat();
            System.out.println(area(radius));
        }
    }
}