import java.util.*;
class HomeWork
{
    public static void main(String []args)
    {
        System.out.println("Java Program For Average of 2 Float Values : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Value : ");
        float f1=sc.nextFloat();
        System.out.println("Enter second vlaue : ");
        float f2=sc.nextFloat();
        float Ans=(f1+f2)/2;
        System.out.println("Average of given Values are : "+Ans);

    }
}