class LocalInnerClass
{
    int age=22;
    String name="Ameer";
    public void details()
    {
        class LocalInner
        {
            void show()
            {
                System.out.println("im a method of local inner class "+age+name);
            }
        }
        LocalInner li=new LocalInner();
        li.show();
    }
}
