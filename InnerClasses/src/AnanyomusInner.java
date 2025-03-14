abstract class Ananyomus
{
    abstract void display();
}
class AnanyomusInner
{
    Ananyomus an=new Ananyomus()
    {
        @Override
        public void display()
        {
            System.out.println("Overriden method of abstract class");
        }
    };
}
