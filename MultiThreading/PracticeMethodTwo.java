import java.util.Scanner;
class PracticeMethodTwo
{
    void greatest(int a,int b)
    {
        if(a>b)
        {
            System.out.println("A is greater ");
        }
        else
        {
            System.out.println("B is greater ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of A :");
        int a=sc.nextInt();
        System.out.print("enter value of B :");
        int b=sc.nextInt();
        PracticeMethodTwo c=new PracticeMethodTwo();
        c.greatest(a, b);
    }
}