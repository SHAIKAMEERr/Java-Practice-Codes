import java.util.Scanner;

class ExceptionHandelling
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of A : ");
        int a=sc.nextInt();
        System.out.println("enter Value of B : ");
        int b=sc.nextInt();
        try
        {
            int c=a/b;
            System.out.println("Division of "+a+" & "+b+" is : "+c);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            int x=arr[12];
            System.out.println(x);
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }

}
