import java.util.Scanner;
class ConstructorPracticeThree
{
    public static void main(String[] args)
    {
        StudentInfo[] std=new StudentInfo[3];
        std[0]=new StudentInfo(110,"Shaik","MBA","DT");
        std[1]=new StudentInfo("B.Tech","ML");
        std[2]=new StudentInfo(121,"Arif");
        for(StudentInfo s: std)
        {
            System.out.println(s);
        }
        System.out.println(std.length);
    }
}
class StudentInfo
{
    private int rollNo;
    private String name;
    private String dept;
    private String sub;
    public int getRollNo()
    {
        return rollNo;
    }
    public String getName()
    {
        return name;
    }
    public String getDept()
    {
        return dept;
    }
    public String getSub()
    {
        return sub;
    }
    public void setSub(String sub)
    {
        sub=this.sub;
    }
    public StudentInfo(String dept,String sub)
    {
        rollNo=100;
        name="Ameer";
        this.dept=dept;
        this.sub=sub;
    }
    public StudentInfo(int rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;
        dept="MCA";
        sub="DSA";
    }
    public StudentInfo(int rollNo,String name,String dept,String sub)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
        this.sub=sub;
    }
    public String toString()
    {
        return "Roll NO: "+rollNo+"\n"+"Name : "+name+"\n"+"Department : "+dept+"\n"+"Subject : "+sub+"\n";
    }
}