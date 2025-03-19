import java.util.*;
class Fun
{
    /*Sum of two numbers 
    public static int sumOfTwoNumbers(int a,int b)
    {
       int sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A : ");
        int a=sc.nextInt();
        System.out.println("Enter B: ");
        int b=sc.nextInt();
        int sum=sumOfTwoNumbers(a,b);
        System.out.println("Sum of two numbers : "+sum);
    }*/

    //product of two numbers
    /*public static int productOfTwoNumbers(int a,int b)
    {
        int product =a*b;
        return product;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a=sc.nextInt();
        System.out.print("Enter B : ");
        int b=sc.nextInt();
        int product=productOfTwoNumbers(a,b);
        System.out.println("Peroduct of two numbers : "+product);
    }*/


    public static void factorialOfNumber(int a)
    {
        int fact=1;
        if(a>0)
        {
        for(int i=1;i<=a;i++)
            {
            fact=fact*i;
            }
        }
        else
        {
            System.out.println("Factorial cannot be find for negitive numbers ");
            return;
        }
        System.out.println("Factorial of a given number is : "+fact);
        return ;
        

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        factorialOfNumber(a);
        
    }
}