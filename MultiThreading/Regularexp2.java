import java.lang.*;
class RegularExp2
{
    public static void main(String []args)
    {
        int i=1060;
        String str=String.valueOf(i);
        boolean s=str.matches("[10]*");
        System.out.println("Given number is boolean "+s);
        
    }
}