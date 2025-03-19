import java.util.*;
class Updateoperation
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n=sc.nextInt();
        System.out.println("Enter position value : ");
        int i=sc.nextInt();
        System.out.println("Select operation :");
        int operation=sc.nextInt();
        if(operation==1){
        int mask=1<<i;
        System.out.println("Updated to zero : "+(n | mask));
        }
        else{
            int mask=~(1<<i);
            System.out.println("Updated into one : "+(n & mask));
        }
    }
}