package MultiThreading;

class ATMExample
{
    synchronized public void checkBalance(String name)
    {
        System.out.print(name+" Is checking the");
        try
        {
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(" balance");
    }
    synchronized public void wtihdrawl(String name, int amount)
    {
        System.out.print(name+" is withdrawing ");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(amount+" $");
    }
}
class Customer extends Thread
{
    String name;
    int amount;
    ATMExample atm;
    public Customer(ATMExample atm,String name, int amount)
    {
        this.atm=atm;
        this.name=name;
        this.amount=amount;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.wtihdrawl(name, amount);
    }
    public void run()
    {
        useATM();
    }
}