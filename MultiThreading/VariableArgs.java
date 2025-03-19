import java.util.Scanner;
class VariableArgs
{
    static int max(int ...a)
    {
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        if(a.length==0)
        {
            return Integer.MIN_VALUE;
        }
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>=max)
            {
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        //sum(121,234,657,87,12,77,9,75,999);
        System.out.println(max());
        System.out.println(max(12));
        System.out.println(max(11,45,767,89,432));
        System.out.println(max(123,456,789,901,1231,349));
    }
}