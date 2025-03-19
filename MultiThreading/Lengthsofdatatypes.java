import java.io.*;
class Lengthsofdatatypes
{
    public static void main(String []arg)
    {
        System.out.println("length of the Integer is"+(Integer.SIZE/8)+"bytes");
        System.out.println("Size of the float is"+(Float.SIZE/8)+"bytes");
        System.out.println("Size of the long is"+(Long.SIZE/8)+"bytes");
        System.out.println("Size of the double is"+(Double.SIZE/8)+"bytes");
        System.out.println("Size of the byte is"+(Byte.SIZE/8)+"bytes");

    }
}