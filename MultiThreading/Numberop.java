import java.util.Scanner;
public class Numberop
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int q,r,pos=1;
        System.out.println("to perform operations :");
        int n=s.nextInt();
        q=Math.abs(n);
        while(q>0)
        {
            r=q%10;
            switch(pos)
            {
                case 1:
                System.out.println("\t"+r+"Is the number present in Ones position");
                break;
                case 2:
                System.out.println("\t"+r+"is the number present in tens digit");
                break;
                case 3:
                System.out.println("\t"+r+"Is the number present in hundreds position");
                break;
                case 4:
                System.out.println("\t"+r+"the given number is in thousands position");
                break;
                default:
                System.out.println("the given number is greater than 9999");
            }
            pos++;
            q=q/10;
            System.out.println("@. to check the given number is positive or negitive:");
            if(n>=0)
            {
                System.out.println("the given number is Positive");
            }
            else{
            System.out.println("the given number is negative");
            }
            System.out.println("to check odd or even");
            {
                if(n%2==0)
                {
                    System.out.println("the given number is even :");
                }
                else{
                    System.out.println("the given number is odd");
                }
            }

        }
    }
}