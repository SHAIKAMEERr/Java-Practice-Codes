import java.util.*;
class Practice
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the Data Type : ");
        System.out.println("1. Byte");
        System.out.println("2. Short");
        System.out.println("3. Integer");
        System.out.println("4. Long");
        System.out.println("5. Float");
        System.out.println("6. Double");
        System.out.println("7. Char");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Byte is the smallest Data Type in java ");
            System.out.println("No of bytes in Byte is : "+Byte.BYTES);
            System.out.println("minimum length of byte is : "+Byte.MIN_VALUE);
            System.out.println("Maximum value of Byte is : "+Byte.MAX_VALUE);
        }
        else if(ch==2)
        {
            System.out.println("Short is the second Smallest Data Type in Java ");
            System.out.println("No of Bytes in Short data Type is : "+Short.BYTES);
            System.out.println("Minimum value of Short Data type is : "+Short.MIN_VALUE);
            System.out.println("MAximum value of Short data Type is : "+Short.MAX_VALUE);
        }
        else if(ch==3)
        {
            System.out.println("Int is the most widely used integral Data Type in Java ");
            System.out.println("No of Bytes in Int data Type is : "+Integer.BYTES);
            System.out.println("Minimum value of Int Data type is : "+Integer.MIN_VALUE);
            System.out.println("MAximum value of Int data Type is : "+Integer.MAX_VALUE);
        }
        else if(ch==4)
        {
            System.out.println("Long is the biggest integral Data Type in Java ");
            System.out.println("No of Bytes in Long data Type is : "+Long.BYTES);
            System.out.println("Minimum value of Long Data type is : "+Long.MIN_VALUE);
            System.out.println("MAximum value of Long data Type is : "+Long.MAX_VALUE);
        }
        else if(ch==5)
        {
            System.out.println("Float is used for decimal numbers in Java ");
            System.out.println("No of Bytes in Float data Type is : "+Float.BYTES);
            System.out.println("Minimum value of Flot Data type is : "+Float.MIN_VALUE);
            System.out.println("MAximum value of Flot data Type is : "+Float.MAX_VALUE);
        }
        else if(ch==6)
        {
            System.out.println("Double  Data Type stores 15-16 decimal values in Java ");
            System.out.println("No of Bytes in Double data Type is : "+Double.BYTES);
            System.out.println("Minimum value of Double Data type is : "+Double.MIN_VALUE);
            System.out.println("MAximum value of Double data Type is : "+Double.MAX_VALUE);
        }
        else if(ch==7)
        {
            System.out.println("Char Data Type is used to store characters in Java ");
            System.out.println("No of Bytes in Char data Type is : "+Character.BYTES);
            System.out.println("Character data type does not store negative values in it because their is no negative characters in java ");
            System.out.println("MAximum value of Character data Type is : "+Character.MAX_VALUE);
        }
        else
        {
            System.out.println("SORRY..! You cannot able to choose other options rather than 1 - 7  ");
        }
    }
}