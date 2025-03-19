import java.util.Scanner;;
public class Functions
{
    public static int AdditionOfTwoNumbers(int a,int b)
    {
        int add=a+b;
        return add;
    }
    public static void main(String []args)
    {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int add=AdditionOfTwoNumbers(a, b);
        System.out.println("enter two numbers : "+add);
    }
}