import java.util.*;
class LeapYear
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Java Program to check given year is leap year or not : ");
        System.out.println("enter year you want to check :");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Given Year is leap year :");
                }
                else
                {
                    System.out.println("Not a leap year...!");
                }
            }
            else
            {
                System.out.println("it is Leap Year");
            }
        }
        else
        {
            System.out.println("Not a leap Year :");
        }

    }
}