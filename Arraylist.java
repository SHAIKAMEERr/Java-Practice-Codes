import java.util.*;
class Arraylist
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Java Program to practice ArrayList ");
        //Syntax for creating ArrayList
        ArrayList<Integer> Demo=new ArrayList<Integer>(5);
        //add elements in an arraylist
        System.out.print("Enter the size of an array List : ");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            Demo.add(sc.nextInt());
        }
        for(int i=0;i<size;i++)
        {
        System.out.print(Demo.get(i)+" ");
        }
    }
}