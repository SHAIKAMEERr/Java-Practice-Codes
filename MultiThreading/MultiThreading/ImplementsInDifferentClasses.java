package MultiThreading;

public class ImplementsInDifferentClasses implements Runnable
{
    public void run()
    {
        int i=0;
        for(;;)
        {
            System.out.println(i+" Runnable in different class Implementing");
            i++;
        }
    }
}
