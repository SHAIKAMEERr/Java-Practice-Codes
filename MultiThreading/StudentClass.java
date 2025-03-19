import java.util.Scanner;
class StudentClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.print("Enter the Roll No of the Student : ");
        s.rollNo=sc.nextLine();
        System.out.print("Enter the Name of the Student : ");
        s.name=sc.nextLine();
        System.out.print("Enter the Name of the Course : ");
        s.course=sc.nextLine();
        System.out.print("Enter marks in First Subject : ");
        s.marks1=sc.nextInt();
        System.out.print("enter marks in Second Subject : ");
        s.marks2=sc.nextInt();
        System.out.print("Enter marks in Third Subject : ");
        s.marks3=sc.nextInt();
        System.out.println("Student Details "+s.details());
        System.out.println("Total marks of a Student = "+s.total());
        System.out.println("Average marks of the Student= "+s.average());
        System.out.println("Grade of the Student based on marks = "+s.grade());
    }
}
class Student
{
    public String rollNo;
    public String name;
    public String course;
    public int marks1;
    public int marks2;
    public int marks3;
    public String details()
    {
        return "\n"+rollNo+"\n"+name+"\n"+course.toUpperCase();
    }
    public float average()
    {
        float averageMarks=total()/3;
        return averageMarks;
    }
    public int total()
    {
        int totalMarks=marks1+marks2+marks3;
        return totalMarks;
    }
    public String grade()
    {
        if(total()>=100||total()<=60)
            return "First Class";
        else if(total()>=60 || total()<=35)
        return "Second Class";
        else
        return "Fail";
    }
}