import java.util.ArrayList;

public class SubSequence
{
    public void subSequence(int []arr)
    {
        ArrayList<Integer> al=new ArrayList<>();
        helper(0,al,arr);
    }
    public void helper(int index,ArrayList<Integer> list,int []arr)
    {
        if(index>=arr.length)
        {
            System.out.println(list);
            return;
        }
        if(list.add(arr[index]))
            helper(index+1,list,arr);
        list.remove(arr[index]);
        helper(index+1,list,arr);
    }
}
