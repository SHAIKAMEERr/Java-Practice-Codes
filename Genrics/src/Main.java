public class Main
{
    public static void main(String[] args)
    {
        GenericsPractice<Integer> g1=new GenericsPractice<>(12);
        System.out.println("______________________________");
        System.out.println(g1.get());
        System.out.println(g1);
        System.out.println("______________________________");
        GenericsPractice<String> g2=new GenericsPractice<>("Hello");
        System.out.println(g2.get());
        System.out.println(g2);
        System.out.println("______________________________");
        GenericMethods gm1=new GenericMethods();
        gm1.get(12);
        gm1.get("Hello");
        GenericMethods.print("Hello");
        System.out.println("______________________________");
        GenericClassWithMultipleParameters<Integer,Double> gc=new GenericClassWithMultipleParameters<>(12,56.674);
        System.out.println(gc.getData());
        System.out.println(gc.toString());
        System.out.println("______________________________");
        GenericClassWithMultipleParameters<String, Character> gc2=new GenericClassWithMultipleParameters<>("Hello",'?');
        System.out.println(gc.getData());
        System.out.println(gc.toString());
        System.out.println("______________________________");

        CustomArrayList<Integer>list=new CustomArrayList<>();
        for(int i=0;i<60;i++)
        {
            list.add(i);
        }
        System.out.println(list.get(4));
        System.out.println(list.length());
        list.remove(5);
        list.set(6,153);
        list.getAll();
        System.out.println("______________________________");

        CustomList<Integer> l=new CustomList<>();
        for(int i=50;i>0;i--)
        {
            l.add(i);
        }
        l.getAll();
        Object o=new Object();
    }
}