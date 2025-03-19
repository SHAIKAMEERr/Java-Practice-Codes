import java.util.Scanner;
class VarArgsOne
{
    static int sum(int ...x)
    {
        for(int y:x)
        {
            System.out.print(y+" ");
        }
        System.out.println();
        if(x.length==0)
        return 0;
        int sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum=sum+x[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sum());
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println(sum(12,34,56,78,90));
    }
}