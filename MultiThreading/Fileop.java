import java.io.*;
public class Fileop
{
    public static void main(String args[])
    {
        try
        {
            FileReader f=new FileReader("Ab.txt");
            System.out.println(f.read());
            f.close();
        System.out.println("file Sucessfully written");
        }
        catch (Exception e)
        {
        System.out.println("error"+e);
        }
    }
}