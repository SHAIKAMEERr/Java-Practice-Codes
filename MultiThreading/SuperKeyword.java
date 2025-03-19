class SuperKeyword
{
    public static void main(String[] args)
    {
        B b=new B();
    }
}
class A
{
    int x=10;
    void show()
    {
        System.out.println("It is a parent class ");
    }
    A(int l)
    {
        System.out.println("we are calling a super class constructor ");
    }
}
class B extends A
{
    int x=30;
    void show()
    {
        super.show();
        System.out.println("It is a sub class ");
    }
    B()
    {
        super(23);
        System.out.println("We are calling a sub class constructor");
    }
}