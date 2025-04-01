import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
class Practiceprograms
{
    public static void main(String []args)
    {
        System.out.println("Practice one d array :");
        System.out.println("Enter the length of an array :");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        List<Integer>l=Arrays.asList(arr);
        System.out.println(l);
        System.out.println("Arraylist Practice :");
        ArrayList<Integer> al=new ArrayList<Integer>(10);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(50);
        al.add(50);
        al.add(70);
        al.add(80);
        System.out.println(al);
        al.set(3,40);
        System.out.println(al);       
        System.out.println(al.get(4));
        System.out.println(al.subList(0,5));
        System.out.println(al.isEmpty());
        al.remove(4);
        System.out.println(al);
    }
}