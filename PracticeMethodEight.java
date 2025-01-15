import java.util.Scanner;
class PracticeMethodEight
{
    static Boolean validate(int age)
    {
        if(age>=3 & age<=15)
        return true;
        else
        return false;
    }
    static void validate(int ...x)
    {
        System.out.println(java.util.Arrays.toString(x));
    }
    static Boolean validate(String name)
    {
        return name.matches("[A-Za-z\\s]+");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the operation which you want to Perform :");
        System.out.println("1. Validate Age ");
        System.out.println("2. Validate Name ");
        int ch=sc.nextInt();
        if(ch==1)
        {
        System.out.print("Enter age of a student :");
        int age=sc.nextInt();
        System.out.println(validate(age));
        }
        else if(ch==2)
        {
            System.out.print("Enter name : ");
            String name=sc.next();
            System.out.println(validate(name));
        }
        else
        {
            int a=12,b=13,c=14,d=15;
            validate(a,b,c,d);
        }
    }
}