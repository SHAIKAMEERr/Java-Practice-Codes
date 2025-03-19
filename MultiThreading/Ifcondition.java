import java.util.Scanner;
public class Ifcondition
{
    public static void main(String []arg)
    {
        System.out.println("to check wheather the person is elgible for voting or not : ");
        Scanner S=new Scanner(System.in);
        System.out.println("enter your age :");
        int age=S.nextInt();
        if(age >= 18)
        {

            System.out.println("the user is ELIGIBLE for voting ");
        }
        else
        {
            System.out.println("not eligible :");
        }

    }
}