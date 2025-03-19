package MultiThreading;

public class ThreadInDifferentClass extends Thread
{
    public void run()
    {
        int i=0;
        for(;;)
        {
            System.out.println(i+"Thread is running");
            i++;
        }
    }
}
