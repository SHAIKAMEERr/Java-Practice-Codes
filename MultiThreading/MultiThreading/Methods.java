package MultiThreading;

public class Methods extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Methods");
            i++;
        }
    }
}
