import java.util.*;
class youngOrNot
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int Age=sc.nextInt();
        if(Age >=1 && Age<12)
        {
            System.out.println("Your a children ");
        }
        else if(Age >=12 && Age<18)
        {
            System.out.println("Your an Teenager");
        }
        else if(Age >=18 && Age <50)
        {
            System.out.println("Your an Young");
        }
        else
        {
            System.out.println("Your an older");

        }
    }
}