import java.util.Scanner;
class PracticeMethodOne
{
    int Odd(int n)
    {
        int a=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
                a=a+i;   
            }
        }
        System.out.print(a);
        return(a);  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        PracticeMethodOne x=new PracticeMethodOne();
        x.Odd(a);
    }
}