import java.util.*;
public class DepricatedDateClass 
{
    public static void main(String[] args)
    {
        System.out.println(System.currentTimeMillis());
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis()
        /1000/60/60/24/365+1970);

        Date d= new Date("11/11/2022");
        System.out.println(d);
        System.out.println(d.getMonth());

        @SuppressWarnings("deprecation")
        GregorianCalander g= new GregorianCalander();
        System.out.println(g.get(Calendar.DAY_OF_YEAR));
    }   
}
