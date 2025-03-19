import java.util.Scanner;
class NestedClasses  
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Outter o=new Outter();
        System.out.println("enter a name ");
        o.name=sc.next();
        System.out.println("Enter your age ");
        o.age=sc.nextInt();
        System.out.println(o.name);
        System.out.println(o.age);
    }
}
class Outter
{
    String name;
    int age;
    class Inner
    {
        int rollNo;
        String Dept;
        void stdName()
        {
            System.out.println(name);
        }
        void stdAge()
        {
            System.out.println(age);
        }
        void rollNo()
        {
            System.out.println(rollNo);
        }
        void Dept()
        {
            System.out.println(Dept);
        }
    }
    void stdDetails()
    {
        System.out.println("Name : "+name+"\n"+"Age : "+age);
    }
    void Outterfun()
    {
        Inner i=new Inner();
        i.Dept();
    }
}
