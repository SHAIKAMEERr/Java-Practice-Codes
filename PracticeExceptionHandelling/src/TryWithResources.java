import java.util.Scanner;

class TryWithResources
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter a number ");
            int n=sc.nextInt();
            System.out.println(n);
        }
    }
}
