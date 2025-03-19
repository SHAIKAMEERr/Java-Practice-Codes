package MultiThreading;

public class ImplementsInSameClass implements Runnable
{
    @Override
    public void run()
    {
        int j=1;
        for(;;)
        {
            System.out.println(j+" Runnable is Implementing");
            j++;
        }
    }
    public static void main(String[] args)
    {
        Thread t1=new Thread(new ImplementsInSameClass());
        t1.start();
        int j=1;
        for(;;)
        {
            System.out.println(j+" Main method is running");
            j++;
        }
    }
}
