import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
class LocalDatePractice
{
    public static void main(String[] args)
    {
        LocalDate l=LocalDate.now();
        System.out.println(l);
        LocalDate l1=LocalDate.of(2025, 10, 24);
        System.out.println(l1);

        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        LocalTime lt2=LocalTime.of(20,10,24);
        System.out.println(lt2);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt2 = LocalDateTime.of(2025, 10, 24, 20, 10, 24);
        System.out.println(ldt2);
    }
}