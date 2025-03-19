import java.util.*;
class Radix
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        if(str.matches("[01]+"))
        {
            System.out.println("Given number is Binary number ");
        }
        else if(str.matches("[0-7]+"))
        {
            System.out.println("Given number is octal");
        }
        else if((str.matches("[0-9A-F]+")))
        {
            System.out.println("Given number is Hexa Decimal ");
        }
        else if(str.matches("[0-9]+"))
        {
            System.out.println("Given number is Decimal ");
        }
        else 
        {
            System.out.println("Given number is not in specfic format ");
        }

    }
}