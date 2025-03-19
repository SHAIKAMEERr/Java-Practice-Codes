import java.util.Scanner;
class Exceptions
{
    Exceptions()
    {
        int rollno,age;
        String name;
    Scanner S=new Scanner(System.in);
    rollno=S.nextInt();
    name=S.nextLine();
    age=S.nextByte();
    void display()
    {
    System.out.println("Rollno of the Student is :");
    System.out.println("Name of the Student is :");
    System.out.println("Age of the Student "+age);
    }
}
}
class A
{
    public static void main(String []args)
    {
    Exceptions e=new Exceptions();
    }
}
