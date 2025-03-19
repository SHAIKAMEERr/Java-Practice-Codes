package MultiThreading;

public class ThreadPrority extends Thread
{
    public void run()
    {
        char c=65;
        for(int i=0;i<101;i++)
        {
            System.out.print(c+" ");
            c++;
        }

    }
}
