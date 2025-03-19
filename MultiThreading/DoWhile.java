import java.util.*;
class DoWhile
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i=i*2;
        }while(i<n);
    }
}