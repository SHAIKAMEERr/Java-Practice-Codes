import java.util.*;
class RegularExpressions
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s=sc.nextLine();
        System.out.println(s.matches("."));
        System.out.println(s.matches("[a]"));
        System.out.println(s.matches("[A][s]"));
        System.out.println(s.matches("[a-z][0-9]"));
        System.out.println(s.matches("^b"));
        System.out.println(s.matches("a|b"));
        System.out.println(s.matches("ameer"));
    }
}