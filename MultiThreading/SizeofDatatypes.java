import java.util.*;
class SizeofDatatypes
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        if(n==1)
        {
        System.out.println("minimum value of byte"+ Byte.MIN_VALUE);
        System.out.println("mavimum value of  Byte"+Byte.MAX_VALUE);
        System.out.println("SIze of byte"+Byte.BYTES);
        }
        else if(n==2)
        {
            System.out.println("minimum value of int"+ Integer.MIN_VALUE);
            System.out.println("mavimum value of int"+Integer.MAX_VALUE);
            System.out.println("SIze of byte"+Integer.BYTES);
        }
        else if(n==3)
        {
            System.out.println("minimum value of char"+ Character.MIN_VALUE);
            System.out.println("mavimum value of  char"+Character.MAX_VALUE);
            System.out.println("SIze of char"+Character.BYTES);
        }
        else if(n==4)
        {
            System.out.println("minimum value of float"+ Float.MIN_VALUE);
            System.out.println("mavimum value of  float"+Float.MAX_VALUE);
            System.out.println("SIze of float"+Float.BYTES);
        }
    }
}