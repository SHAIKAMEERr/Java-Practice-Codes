import java.util.Date;
public class Student
{
    String name;
    private String rollNo;
    String dept;
    private static int count=1;
    String getName()
    {
        return name;
    }
    String getDept()
    {
        return dept;
    }
    private String setRollNo()
    {
        Date d=new Date();
        String rn="MITS-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }
    Student(String name,String dept)
    {
        rollNo=setRollNo();
    }
    public String getRollno()
    {
        return rollNo;
    }
}
