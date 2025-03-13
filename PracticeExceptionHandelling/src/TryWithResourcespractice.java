import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResourcespractice
{
    public static void main(String[] args)
    {
        try(java.util.Scanner s=new java.util.Scanner(System.in); PrintWriter f=new PrintWriter(new File("jhon.txt")) )
        {
            f.println("Hello");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}
