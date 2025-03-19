import java.util.*;
public class calculator
{
    public static void main(String []args)
    {
        System.out.println("java program for caluclator :");
        Scanner s=new Scanner(System.in);
        System.out.println("choose the choice which you wants to perform : ");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulo division");
        System.out.println("6.power function");
        int choice=s.nextInt();
        if(choice==1)
        {
            System.out.println("your choice is : "+choice);
            System.out.println("enter numbers to perform Addition : ");
            int num1=s.nextInt();
            int num2=s.nextInt();
            int n=num1+num2;
            System.out.println("addition  of "+num1+" and "+num2+" are :"+n);
        }
        else if(choice==2)
        {
            System.out.println("your choice is : "+choice);
            System.out.println("enter numbers to perform Substraction : ");
            int num1=s.nextInt();
            int num2=s.nextInt();
            int n=num1-num2;
            System.out.println("Substraction  of "+num1+" and "+num2+" are :"+n);
        }
        else if(choice==3)
        {
            System.out.println("your choice is : "+choice);
            System.out.println("enter numbers to perform multiplication : ");
            int num1=s.nextInt();
            int num2=s.nextInt();
            int n=num1*num2;
            System.out.println("multiplication of "+num1+"and"+num2+"are :"+n);
        }
        else if(choice==4)
        {
            System.out.println("your choice is : "+choice);
            System.out.println("enter numbers to perform division : ");
            int num1=s.nextInt();
            int num2=s.nextInt();
            int n=num1/num2;
            System.out.println("division of "+num1+"and"+num2+"are :"+n);
        }
        else if(choice==4)
        {
            System.out.println("your choice is : "+choice);
            System.out.println("enter numbers to perform modulo division : ");
            int num1=s.nextInt();
            int num2=s.nextInt();
            int n=num1%num2;
            System.out.println("modulo division of "+num1+"and"+num2+"are :"+n);
        }
        else if(choice==5)
        {
            System.out.println("your choice is : "+choice);
            System.out.println("enter numbers to perform square : ");
            int num1=s.nextInt();
            int num2=s.nextInt();
            int n=num1 + num2;
            System.out.println("square of " +num1+ "and" +num2+ "are :"+n);
        }
        else if(choice==6)
        {
            System.out.println("your choice is : "+choice);
            System.out.println("enter numbers to perform power : ");
            int num1=s.nextInt();
            int num2=s.nextInt();
            int n=num1^num2;
            System.out.println("power of "+num1+"and"+num2+"are :"+n);
        }
        else
        {
            System.out.println("You choose the wrong function to perform operation");
        }
    }
}