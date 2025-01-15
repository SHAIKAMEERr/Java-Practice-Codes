import java.util.Scanner;
class StringbuilderPractice
{
    /*public static void main(String[] args)
    {
        System.out.println("Java Program to check the string is a palindrome or not ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String to check Given number is a Palindrome or Not : ");
        String str=sc.nextLine();
        String op=str;
        String str2="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);
        if(str2.equals(op))
        {
            System.out.println("It is a Palindrome ");
        }
        else
        {
            System.out.println("It is not a palindrome ");
        }
    }*/
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("ameer");
        sb.append("str");
        System.out.println(sb);
        sb.insert(5,"jan");
        System.out.println(sb);
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.lastIndexOf("a"));
        System.out.println(sb.substring(5,8));
        System.out.println(sb.charAt(4));
        sb.reverse();
        System.out.println(sb);
        sb.delete(2,4);
        System.out.println(sb);
        System.out.println(sb.isEmpty());
        sb.delete(0, 7);
        System.out.println(sb);
        sb.toString();
        System.out.println(sb);
    }
}