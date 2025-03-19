import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class PracticeOne
{
    public void add()
    {
        int size=10000000;
        List<Integer> vector=new Vector<>();
        long startTime=System.currentTimeMillis();
        for(int i=0;i<size;i++)
        {
            vector.add(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Time taken to add elements in Vector : "+(endTime-startTime)+" MilliSeconds");
        System.out.println("Size of Vector : "+vector.size());


        List<Integer> arraylist=new ArrayList<>();
        startTime=System.currentTimeMillis();
        for(int i=0;i<size;i++)
        {
            arraylist.add(i);
        }
        endTime=System.currentTimeMillis();
        System.out.println("Time Taken to add elements in ArrayList : "+(endTime-startTime)+" Milli Seconds");
        System.out.println("Size of ArrayList : "+arraylist.size());
        
    }
}
