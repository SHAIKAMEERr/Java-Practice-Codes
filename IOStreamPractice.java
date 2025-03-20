import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamPractice 
{
 public static void main(String[] args) 
 {
    try
    {
        FileInputStream fw=new FileInputStream("C:/JavaPrograms/StudentPractice.txt");  
        String str="Helolo we are performing a student practice challenge";
        fw.read(str.getBytes(str));
        FileOutputStream fos=new FileOutputStream("C:/JavaPrograms/StudentDemo.txt");
        fos.write(fw.read());
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
