import java.util.*;
class Stringfun
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Complete String Functions : ");
        String s=sc.nextLine();
        char c[]={'a','b','c','6'};
        System.out.println(" Data present in Char data type "+c);
        String s1=new String(c);
        System.out.println("Converting char data in to String by using string method : "+s1);
        byte b[]={65,66,67,68,69,70};
        String s2=new String(b);
        System.out.println(s2);
        String s3="Hello";
        System.out.println("Enter a string : ");
        String s4=sc.nextLine();
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s3.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s4.trim());
        System.out.println(s4.replace('o','a'));
        System.out.println(s3.concat(s4));
        System.out.println(s4.charAt(3));
        System.out.println(s4.indexOf('a'));
        System.out.println(s4.startsWith("Am"));
        System.out.println(s4.endsWith("er"));
        System.out.println(s4.lastIndexOf('r'));
    }
}