import java.util.ArrayList;
public class ReturnArrayList
{
    public static void main(String[] args)
    {
        int []arr={1,2,4,6,5,7,3,4,9,4};
        allIndexes(arr,4,0);
        System.out.println(l);
    }
    static ArrayList<Integer> l=new ArrayList<>();
    public static void allIndexes(int []arr,int target,int index)
    {
        //Base Condition
        if(index>=arr.length)
        {
            return ;
        }
        //Storing the index values in to the array list with the help of add()
        if(arr[index]==target)
        {
            l.add(index);
        }
         allIndexes(arr,target,index+1);
    }
}
