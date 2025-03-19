import java.lang.*;
class HexaOrNot
{
    public static void main(String args[])
    {
        
        String str="4213xAAB";
        boolean b=str.matches("[0-9A-F]+");
        System.out.println(b);
    }
}