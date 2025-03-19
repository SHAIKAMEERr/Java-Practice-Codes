import java.util.*;
class Practiceone
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter First Number :");
        int n1=sc.nextInt();
        System.out.println("Enter Second Number : ");
        int n2=sc.nextInt();
        System.out.println("Choose the operation which you want to perform");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplaction");
        System.out.println("4.Division");
        System.out.println("5.Modulo Division");
        System.out.println("6.Squares");
        System.out.println("7.Roots of given numbers");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Addition of Two Numbers are : "+(n1+n2));
        }
        else if(choice==2)
        {
            System.out.println("Subtraction of Two numbers are : "+(n1-n2));
        }
        else if(choice==3)
        {
            System.out.println("Multiplaction of Two Numbers are : "+(n1*n2));
        }
        else if(choice==4)
        {
        System.out.println("Division of two numbers are : "+(n1/n2));
        }
        else if(choice==5)
        {
            System.out.println("Modulo Division of Two Numbers are : "+(n1%n2));
        }
        else if(choice==6)
        {
            System.out.println("Square of the First number is : "+(n1*n1)+"\n"+"Square of Second Number is :"+(n2*n2));
        }
        else if(choice==7)
        {
            System.out.println("Roots of the given first number is : "+Math.sqrt(n1)+"\n"+"Roots of the Second Number is : "+Math.sqrt(n2));
        }
        else 
        {
            System.out.println("you choose wrong operation");
        }
    }
}