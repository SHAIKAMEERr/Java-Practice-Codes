import java.lang.*;
class DateFun
{
    public static void main(String[]args)
    {
        String str="01/12/2023";
       System.out.println(str.matches("[0-3][0-9]/[0-1][1-9]/[0-9]{4}"));
    }
}