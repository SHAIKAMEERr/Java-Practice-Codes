import java.util.*;
class MetaCharacters
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println(str.matches("\\s"));
        System.out.println(str.matches("\\S"));
        System.out.println(str.matches("\\d"));
        System.out.println(str.matches("\\D"));
        System.out.println(str.matches("\\w"));
        System.out.println(str.matches("\\W"));
    }
}