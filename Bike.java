class InterfacesExample 
{
    public static void main(String[] args)
    {
        Bike b;
        scooty s;
        b=new BikeDetails();
        s=new BikeDetails();
        b.engineType("Diesal");
        Bike.details();
        System.out.println(Bike.no);
        s.bikeType();
    }   
}
// private interface Ab
// {
    
// }
public abstract interface Bike
{
    int no=10;
    public abstract void engineType(String eng);
    void color(String bColor);
    void bikeType();
    void bikeName(String name);
    static void details()
    {
        System.out.println("Details of the bike method");
    }
    default void info()
    {
        System.out.println("Information about bike ");
    }
}
interface scooty extends Bike
{
    void breaking();
    void cc(int x);
    static void scootyDetails()
    {
        System.out.println("Scooty details");
    }
}
class BikeDetails implements Bike,scooty
{
    @Override
    public void engineType(String eng)
    {
        System.out.println("Engine type of a bike"+eng);
    }
    @Override
    public void color(String bColor)
    {
        System.out.println("Color of your bike "+bColor);
    }
    public void bikeType()
    {
        System.out.println("Bike type ");
    }
    public void bikeName(String name)
    {
        System.out.println("Name of your Bike :"+name);
    }
    public void breaking()
    {
        System.out.println("It is abs Breaking System ");
    }
    public void cc(int x)
    {
        System.out.println("CC of Your bike is : "+x);
    }
}