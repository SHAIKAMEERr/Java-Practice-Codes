class InterfacesDemo 
{
    public static void main(String[] args)
    {
        // DiesalCar dl=new DiesalCar();
        // Break b=new CarBreak();
        // b.breaks();
        // b.stop();
        // Engine e=new DiesalCar();
        // e.accelrate();
        // e.stop();
        // musicPlayer mp=new DiesalCar();
        // mp.play();
        Break br=new Break() {
            public void breaks()
            {
                System.out.println("Car Breakes");
            }
            public void stop()
            {
                System.out.println("Break is applied car is stop now");
            }
        };
        br.breaks();
        br.stop();
        Break.meth1();
    }
}
interface Break
{
    static final int x=100;
    void breaks();
    void stop();
    static void meth1()
    {
        System.out.println("Method one");
    }
}
interface Engine 
{
    void start();
    void stop();
    void accelrate();
}
interface musicPlayer
{
    void play();
    void pause();
    void next();
}
class DiesalCar implements Engine,musicPlayer
{
    @Override
    public void start()
    {
        System.out.println("Desial car engine is on ");
    }
    @Override
    public void stop()
    {
        System.out.println("Diesal car engine is Stop now ");
    }
    @Override
    public void accelrate()
    {
        System.out.println("Speed is boosting in diesal car ");
    }
    public void play()
    {
        System.out.println("Music is palying ");
    }
    public void pause()
    {
        System.out.println("Music is paused");
    }
    public void next()
    {
        System.out.println("Music is changed");
    }
}
class CarBreak implements Break
{
    @Override
    public void breaks()
    {
        System.out.println("Breaks in Diesal Car ");
    }
    @Override
    public void stop()
    {
        System.out.println("Car is stopped now ");
    }
}
