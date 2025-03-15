import java.util.Scanner;
public class Prime 
{
public static void main(String []args)
{
   
    System.out.println("Choose the operations from menu");
    System.out.println("1.Prime number or not");
    System.out.println("2.factor of the given number");
    System.out.println("3.odd or even");
    Scanner s=new Scanner(System.in);
    int i;
    int n=s.nextInt();
    int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("ur choice is 1"+ch+"prime number ");
            System.out.println("Enter a number");
            int n1=s.nextInt();
            for(i=2;i<n1/2;i++)
            {
                if(n1%i==0)
                {
                    System.out.println("the given number is prime :");
                }
                else{
                    System.out.println("the given number is not a prime number");
                }
            break;
            }
            case 2:
            System.out.println("ur choice is"+ch+"factor");
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    System.out.println("factor of the given number is");
                }
                else{
                    System.out.println(" ");
                }
            }
            break;
            case 3:
            System.out.println("choice is"+ch+"odd or even");
            if(n%2==0)
            {
                System.out.println("Given number is even");
            }
            else
            {
                System.out.println("odd");
            }
            break;
            default:
            System.out.println("invalid number");
        break;
        }
    }
}

    
    

