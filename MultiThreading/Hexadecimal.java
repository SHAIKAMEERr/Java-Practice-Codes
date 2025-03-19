import java.util.Scanner;
public class Hexadecimal
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        String output="";
        System.out.println("enter a number :");
        int n=s.nextInt();
        while(n>0)
        {
        int r=n%16;
        switch(r)
        {
            case 1:
                output="a"+output;
            break;
            case 2:
            output="b"+output;
            break;
            case 3:
            output="c"+output;
            break;
            case 4:
            output="d"+output;
            break;
            default:
                output=r+output;
            break;
        }
            n=n%16;
        }
        System.out.println("hexa decimal of the given number is :"+output);
    }
}