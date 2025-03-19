import java.util.*;
class WhileLoop
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value Of N : ");
        int N=sc.nextInt();
        int i=1;
        while(i<N)
        {
            System.out.println("Multiples of 2 are : "+i);
            i=i*2;
        }
    }
}