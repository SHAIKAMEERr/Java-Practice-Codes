import java.util.ArrayList;
import java.util.Scanner;
class ArrayListPractice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>(10);
        System.out.println(al.add(12));
        System.out.println(al.add(13));
        System.out.println(al.add(14));
        System.out.println(al.get(2));
        System.out.println(al.size());
        System.out.println(al.indexOf(14));
        System.out.println(al.lastIndexOf(12));
        for(int x:al)
        {
            System.out.println(al.add(0,5));
        }
    }
}