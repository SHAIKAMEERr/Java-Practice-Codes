package MultiThreading;

public class ClassRoom
{

}
class Whiteboard
{
    String text;
    int count=0;
    int attendence=0;
    public void set(String text)
    {
        this.text=text;
        System.out.println("Teacher is writing in White board "+text);
        while(count!=0)
        try
        {
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        count=attendence;
        notifyAll();
    }
    public String get()
    {
        System.out.println("Student is Writing :");
        while(count==0)
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        notifyAll();
        return text;
    }
    public int AttendenceOfStudents()
    {
        return attendence++;
    }
}