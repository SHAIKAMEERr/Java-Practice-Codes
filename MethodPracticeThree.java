import java.util.Scanner;
class MethodPracticeThree 
{
    static boolean Prime(int a)
    {
        
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=s.nextInt();
        System.out.println(Prime(n));
    }
}
