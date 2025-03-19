import java.util.*;
class StudentGrades
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Marks : ");
        System.out.println("Enter your English Marks : ");
        int English=sc.nextInt();
        System.out.println("Enter your marks in Maths : ");
        int Maths=sc.nextInt();
        System.out.println("Enter Your marks in Science : ");
        int Science=sc.nextInt();
        float Grade=((English + Maths + Science)/3);
        System.out.println(Grade);
        if(Grade>=75)
        {
            System.out.println("Destintion");
        }
        else if(Grade >60 && Grade <75)
        {
            System.out.println("First class");
        }
        else if(Grade >=35 && Grade <60)
        {
            System.out.println("Second Class");
        }
        else
        {
            System.out.println("OOps Fail....!!!");
        }

    }
}