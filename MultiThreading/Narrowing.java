import java.io.*;
public class Narrowing
{
    public static void main(String []args)
    {
        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.5f;
        double d=60.66;
        char c=67;
        boolean bl=true;
        i =(int)f;
        System.out.println(i);
        
    }
}