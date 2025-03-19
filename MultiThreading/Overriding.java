class Car
{
    void Start()
    {
        System.out.println("Car is Starting ");
    }
    void accelrate()
    {
        System.out.println("Driver is excelrating the car ");
    }
    void changeGear()
    {
        System.out.println("Gares in this car is Manual ");
    }
}
class LuxaryCar extends Car
{
    @Override
    void Start()
    {
        System.out.println("Luxary car is Starting ");
    }
    @Override
    void accelrate()
    {
        System.out.println("Luxary car is accelrating");
    }
    @Override
    void changeGear()
    {
        System.out.println("Gare change is automation ");
    }
    void topRoof()
    {
        System.out.println("This car also has a sun roof ");
    }
}
class Overriding
{
    public static void main(String[] args)
    {
        Car c=new LuxaryCar();
        c.Start();
        c.accelrate();
        c.changeGear();
        LuxaryCar l=new LuxaryCar();
        l.topRoof();
    }
}