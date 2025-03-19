import java.util.*;
class Practicefive
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        /* System.out.println("To check given number is decimal or not : ");
        int i=sc.nextInt();
        String s=String.valueOf(i);
        System.out.println(s.matches("[01]+")); */
       
       
       /* System.out.println("Java program to check given number is Hexa Decimal or Not :");
        String s=sc.nextLine();
        System.out.println(s.matches("[0-9 A-F]+")); */
        
        System.out.println("java program to find the given data is in data format or not : ");
       // int i=sc.nextInt();
        String s="07/07/2023";
        System.out.println(s.matches("[0-3][1-9]/[0-1][0-9]/[0-9]{4}"));
    }
}