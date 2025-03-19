import java.util.*;
class DigitsOfNumber{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Digit : ");
        int n=sc.nextInt();
        int i=0;
        int count=0;
        while(i<n)
        {
            n=n/10;
           count++;
        }
        System.out.println(count);

        
    }
}