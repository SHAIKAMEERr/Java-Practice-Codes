import java.util.*;
class DayNumber
{
    public static void main(String []args)
    {
        System.out.println("Java program to find the day based on the number :");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a day number between 1-7");
        int day=s.nextInt();
       /* checking the condition by using if statement
        if(day==1)
        {
            System.out.println("Monday");
        }
        else if(day==2)
        {
            System.out.println("Tuesday");
        }
        else if(day==3)
        {
            System.out.println("Wednesday");
        }
        else if(day==4)
        {
            System.out.println("Thursday");
        }
        else if(day==5)
        {
            System.out.println("Friday");
        }
        else if(day==6)
        {
            System.out.println("Saturday");
        }
        else if(day==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("you choose a wrong option :");
        }*/


        //checking the condition using switch statement
        switch(day)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("You choosed a wrong option: ");
        }
    }
}