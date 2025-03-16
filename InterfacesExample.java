public class InterfacesExample 
{
    public static void main(String[] args)
    {
        Phone ph;
        Call ch;
        SmartPhone sp;
        Keypad kp;
        Iphone ip;
        ph=new Iphone();
        ph.on();
        ph.off();
    }    
}
interface Phone
{
    void on();
    void off();
}
interface Call extends Phone
{
    void callOutGoing();
    void callComing();
    void missedCall();
}
interface SmartPhone
{
    void net();
    void musicPalyer();
    void touch();
}
class Keypad implements Phone
{
    public void on()
    {
        System.out.println("Phone is on ");
    }
    public void off()
    {
        System.out.println("Phone is Off");
    }
    public void callOutGoing()
    {
        System.out.println("You are making a call");
    }
    public void callComing()
    {
        System.out.println("You are receving a call");
    }
    public void missedCall()
    {
        System.out.println("You missed a call");
    }
}
class Iphone extends Keypad implements SmartPhone
{
    public void net()
    {
        System.out.println("You can access net ");
    }
    public void musicPalyer()
    {
        System.out.println("You can play music in your phone ");
    }
    public void touch()
    {
        System.out.println("You are using IPhone 8");
    }
}
