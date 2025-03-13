import java.util.Scanner;

class ExceptionInDifferentClasses
{
   public static void main(String[] args)
   {
       java.util.Scanner sc=new java.util.Scanner(System.in);
       System.out.println("enter a :");
       int a=sc.nextInt();
       System.out.println("Enter B :");
       int b=sc.nextInt();
       Different.div(a,b);
   }
}
class Different
{
    public static void div(int a,int b)
    {
        try
        {
           int c=a/b;
           System.out.println("Division : "+c);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
