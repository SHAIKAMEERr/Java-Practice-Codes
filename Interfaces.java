class Interfaces 
{
    public static void main(String[] args)
    {
        Store s=new Store();
        Customers c1=new Customers("Ameer");
        s.register(c1);
        c1.callBack();
    }
}
interface member
{
    void callBack();
}
class Store
{
    member[] mem=new member[10];
    int count=0;
    void register(member m)
    {
        mem[count++]=m;
    } 
    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callBack();
        }
    }
}
class Customers implements member
{
    String name;
    Customers(String name)
    {
        this.name=name;
    }
    public void callBack()
    {
        System.out.println("I will come to the store : "+name);
    }
}