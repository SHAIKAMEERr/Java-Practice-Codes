import java.io.*;
class Swapping
{
    public static void main(String []args)
    {
        System.out.println("Swapping of two numbers without using third variable : ");
        int a=10,b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("swapping of a & b is :"+a+" "+b);
    }
}