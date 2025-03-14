public class Main
{
    public static void main(String[] args)
    {
//        System.out.println("Practicing Lambda Expressions");
//        PracticeLambda d=(n, l)->
//        {
//            for(int i=1;i<=n;i++)
//            {
//                try {
//                    System.out.println(l + " X " + i + " = " + (l * i));
//                    Thread.sleep(1000);
//                }
//                catch(ArithmeticException | InterruptedException e)
//                {
//                    System.out.println(e);
//                }
//            }
//        };
//        d.mul(20,10);


//        PracticeLambda pl=MethodReference::printAlphabets;
//        pl.mul(10,20);
//        MethodReference mr=new MethodReference(10,34);
//        PracticeLambda p1=MethodReference::new;
//        p1.mul(12,23);
//        Runnable r=mr::demo;
//        Thread t=new Thread(r);
//        t.start();

        //Method reference of a static method
        //PracticeLambda p=MethodReference::add;
//        PracticeLambda p=MethodReference::new;
//        p.mul(10,20);
//        MethodReference mr=new MethodReference();
//        PracticeLambda pl=mr::multiplesOfTwo;
//        pl.mul(20);




        //Practice Constructor Reference
        PracticeLambda pl=MethodReference::new;
        pl.show("Ameer");
    }
}