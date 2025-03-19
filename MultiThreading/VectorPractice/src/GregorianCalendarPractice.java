import java.util.Calendar;
import java.util.GregorianCalendar;
public class GregorianCalendarPractice
{
    public static void main(String[] args)
    {
        Gregorian();
    }
    public static void Gregorian()
    {
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.getCalendarType());
        System.out.println(gc.getTimeZone());
        System.out.println(gc.getTime());
        System.out.println(gc.getGregorianChange());
        gc.set(2000,10,24);
        System.out.println(gc);
        gc.set(2000,10,24,18,55);
        System.out.println(gc);
        System.out.println(Calendar.getAvailableCalendarTypes());
        Calendar c=Calendar.getInstance();
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DATE);
        System.out.println(Calendar.SECOND);
    }
}
