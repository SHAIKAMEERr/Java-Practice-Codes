import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos=new FileOutputStream("C:/JavaPrograms/Streams/Demo.txt");
            String str="Hello World";
            fos.write(str.getBytes());
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}