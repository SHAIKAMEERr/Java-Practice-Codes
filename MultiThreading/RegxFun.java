import java.lang.*;
class RegxFun
{
    public static void main(String []args)
    {
        String str="ameer@      aaaaa vvvvv    123$";
        boolean s=str.matches("[A-Za-z0-9]+");
        String r=str.replaceAll("[^A-za-z0-9]","");
        System.out.println(r);
        String sp=str.replaceAll("\\s+"," ");
        System.out.println(sp);
        String spl[]=str.split("\\s");
        System.out.println(spl.length);
    }
}