import java.util.Scanner;
class ConstructorPracticeTwo
{
    public static void main(String[] args)
    {
        System.out.println("Student Marks :");
        SubjectDetails sd=new SubjectDetails(null, 0, 0);
        System.out.println("Subject ID = "+sd.getId());
        System.out.println("Subject Name = "+sd.getName());
        System.out.println("Maximum Marks In A Subject = "+sd.getMaxMarks());
        System.out.println("Marks obtained = "+sd.getMarks());
    }
}
class SubjectDetails
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;
    public String getId()
    {
        return subID;
    }
    public String getName()
    {
        return name;
    }
    public int  getMaxMarks()
    {
        return maxMarks;
    }
    public int getMarks()
    {
        return marksObtain;
    }
    public void setMarksObtained(int m)
    {
        marksObtain=m;
    }
    public void setMaxMarks(int mo)
    {
        if(mo>0||mo<=100)
        {
            marksObtain=mo;
        }
    }
    public SubjectDetails(String s1,String s2,int i1,int i2)
    {
        subID=s1;
        name=s2;
        maxMarks=i1;
        marksObtain=i2;
    }
    public SubjectDetails(String id,int max,int marks)
    {
        subID=id;
        name="OOPs";
        maxMarks=max;
        marksObtain=marks;
    }
    class StudentMarks
    {
        private String rollno;
        private String name;
        private String department;
        private String[] subjects;
        public String setRollNo()
        {
            return rollno;
        }
        public String setName()
        {
            return name;
        }
        public String setDept()
        {
            return department;
        }
        public String[] setSubject()
        {
            return subjects;
        }
    }
}