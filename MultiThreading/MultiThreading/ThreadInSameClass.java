package MultiThreading;

public class ThreadInSameClass extends Thread
{
    public void run()
    {
        int j=0;
        for(;;)
        {
            System.out.println("Thread is running ");
            j++;
        }
    }
    static public void main(String[] args)
    {
        ThreadInSameClass p=new ThreadInSameClass();
        p.start();
        int i=0;
        while(true)
        {
            System.out.println("Main method is running");
            i++;
        }
    }
}
