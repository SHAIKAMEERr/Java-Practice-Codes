import java.util.*;
class ArrayListPracticeExample
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.addAll(Arrays.asList(20,30,40,50));
        System.out.println(list);
    }
}