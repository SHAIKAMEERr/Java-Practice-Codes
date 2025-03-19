import java.util.*;
class SwitchFour
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1=sc.nextInt();
        System.out.println("Enter a Second number : ");
        int  n2=sc.nextInt();
        System.out.println("Choose an option : ");
        System.out.println("1.Addition ");
        System.out.println("2.Subtraction ");
        System.out.println("3.Multiplaction ");
        System.out.println("4.Division ");
        System.out.println("5.Modulo Division ");
        int Choice=sc.nextInt();
        switch(Choice)
        {
            case 1:
            System.out.println("Addition of "+n1+" & "+n2 +" is : "+(n1+n2));
            break;
            case 2:
            System.out.println("Subtraction of "+n1+" & "+n2 +" is : "+(n1-n2));
            break;
            case 3:
            System.out.println("Multiplication of "+n1+" & "+n2 + " is : "+(n1*n2));
            break;
            case 4:
            System.out.println("Division of "+n1+" & "+n2 +" is : "+(n1/n2));
            break;
            case 5:
            System.out.println("Modulo Division of "+n1+" & "+n2 + " is : "+(n1%n2));
            break;
            default:
            System.out.println("Invalid Choice : ");
            break;
        }

    }
}