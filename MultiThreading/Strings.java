import java.lang.*;
class Daytwo
{
public static void main(String args[])
{
    int i=74;
String S="Mr.AmeerJanShaik";
String s="Mr.AmeerJanShaik";
String str="MR.AMEERJANSHAIK";
String sone=new String("Mr.AmeerJanShaik");
int l=s.length();
String s1=s.toUpperCase();
String s2=s.toLowerCase();
String s3=s.trim();
String s4=s.replace('a','s');
String s5=s.substring(5);
String s6=s.substring(2,13);
char s7=s.charAt(6);
boolean s8=s.startsWith("Mr.");
boolean s9=s.endsWith("Shaik");
int s10=s.indexOf("ee");
int s11=s.lastIndexOf("S");
boolean s12=s.equals(S);
boolean s13=s.equalsIgnoreCase(str);
String s14=s.valueOf(i);
int s15=s.compareTo(S);
System.out.println(s);
System.out.println(l);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(s6);
System.out.println(s7);
System.out.println(s8);
System.out.println(s9);
System.out.println(s10);
System.out.println(s11);
System.out.println(s12);
System.out.println(s13);
System.out.println(s14);
System.out.println(s15);

}}