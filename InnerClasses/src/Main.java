class Outter
{
    int a=10;
    int b=20;
    class Inner
    {
        int c=30;
        void sum()
        {
            System.out.println("Sum of "+a+" "+b+" "+c+" = "+(a+b+c));
        }
    }
    void display()
    {
        Inner i=new Inner();
        i.sum();
    }
}
class Main
{
    public static void main(String[] args)
    {
        //this is the object of nested inner classes
        Outter o=new Outter();
        o.display();




        //this is the object of nested local classes
        LocalInnerClass ic=new LocalInnerClass();
        ic.details();

        //object of static innerclass
        StaticInner.Inner.staticSum();


        //object of ananymous inner class
        AnanyomusInner a=new AnanyomusInner();
        a.an.display();

        //singleton class
        Singleton st=Singleton.getCoffee();

        Student s=new Student("Ameer","Mca");
        Student s1=new Student("Shaik","MBA");
        System.out.println("Name of the student : "+s.getName());
        System.out.println("Department of the student : "+s.getDept());
        System.out.println("Roll No of the student : "+s.getRollno());
        System.out.println("Roll No of the student : "+s1.getRollno());

    }
}