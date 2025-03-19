package MultiThreading;

public class Main
{
    public static void main(String[] args)
    {
        Methods m=new Methods();
        m.setDaemon(true);
        m.start();
        Thread main=Thread.currentThread();
        try {
            main.join(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//        ConstructorsofThreadClass c=new ConstructorsofThreadClass("Thread1");
//        System.out.println("Id : "+c.getId());
//        System.out.println("NAme : "+c.getName());
//        System.out.println("State : "+c.getState());
//        System.out.println("Alive : "+c.isAlive());
//        c.setPriority(6);
//        System.out.println("Priority : "+c.getPriority());
//        System.out.println(c.getThreadGroup());
//        System.out.println(c.isDaemon());
//        System.out.println(c.isInterrupted());
//        System.out.println(c.getClass());
//        System.out.println(c.NORM_PRIORITY+2);







//        ThreadPrority t=new ThreadPrority();
//        t.start();
//        int x=Thread.MAX_PRIORITY-3;













//        SyncronizedPractice sp=new SyncronizedPractice();
//        Thread1 t1=new Thread1(sp);
//        thread2 t2=new thread2(sp);
//        t1.start();
//        t2.start();










        //Code for methods in multi threading
//        Methods m=new Methods("Ameer");
//        m.start();
//        System.out.println(m.getId());
//        System.out.println(m.getName());
//        System.out.println(m.getPriority());
//        System.out.println(m.isAlive());
//        System.out.println(m.getState());
//        m.notify();












/*
        Code for threads in different class
        ThreadInDifferentClass td=new ThreadInDifferentClass();
        td.start();
        int j=1;
        for(;;)
        {
            System.out.println(j+" MAin method is running");
            j++;
        }
*/



//        ImplementsInDifferentClasses id=new ImplementsInDifferentClasses();
//        Thread th=new Thread(id);
//        int i=0;
//        for(;;)
//        {
//            System.out.println(i+" Running main method in different class ");
//            i++;
//        }

    }
}
