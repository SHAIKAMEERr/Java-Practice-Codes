// import java.util.*;
// class StringReversedWord
// {
//     public static void main(String args[])
//     {
//         System.out.println("Java Program to reverse each word in a given string :");
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a string :");
//         String str=sc.nextLine();
//         String output="";
//         String[] word=str.split(" ");
//         for(String w: word)
//         {
//             String rev=" ";
//             for(int i=w.length()-1;i>=0;i--)
//             {
//                 rev=rev+ w.charAt(i);
//             }
//             output=output+rev;
//         }
//         System.out.println("Modified String : "+output);
//     }
// }
import java.util.Scanner;
class StringReversedWord
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String op="";
        String arr[]=str.split(" ");
        for(String s:arr)
        {
            String st=" ";
            for(int i=(s.length()-1);i>=0;i--)
            {
                st=st+s.charAt(i);
            }
            op=op+st;
        }
        System.out.println("reverse of a string : "+op);
    }
}

