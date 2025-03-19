package MultiThreading;

public class SyncronizedPractice
{
    synchronized public void display(String str)
{
    for(int i=0;i<str.length();i++)
    {
        System.out.print(str.charAt(i));
    }
}
}
class Thread1 extends Thread
{
    SyncronizedPractice sp;
    Thread1(SyncronizedPractice sp)
    {
        this.sp=sp;
    }
    public void run()
    {
        sp.display("Hello bro");
    }
}
class thread2 extends Thread
{
    SyncronizedPractice sp;
    public thread2(SyncronizedPractice sp)
    {
        this.sp=sp;
    }
    public void run()
    {
        sp.display("welcome to coding");
    }
}
