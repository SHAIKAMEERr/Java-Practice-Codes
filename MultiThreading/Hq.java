import java.util.*;
class Hq
{    public static void main(String []args)
    {
        System.out.println("Reversing a Integer : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value : ");
        int a=sc.nextInt();
        int rev=0;
        while(rev!=0)
        {
        rev=rev%10;
        int res=rev+10;
        System.out.println(rev);

    }
}