import java.util.*;
class Sample
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number to check the given number is perfect number or not...!");
       int n=sc.nextInt();
       int m=0;
       for(int i=1;i<n;i++)
       {
        if(n%i==0)
        {
            System.out.print(i+" ");
            m=m+i;
        }
       }
       System.out.println();
       if(m==n)
       {
        System.out.println("Given number is perfect number :");
       }
       else {
        System.out.println("Given number is not a perfect number....!");
       }
       
       
       
       
       
       
       
       
        /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");

            }
        }*/ 
        
        
        
        
        
        
        /*int a=0,b=1;
        for(int i=0;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }*/
        
        
        /*System.out.println("Enter the value of first term :");
        int a=sc.nextInt();
        System.out.println("Enter the difference :");
        int d=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            int x=a*d;
            a=x;
            System.out.print( x+" ");
        }*/
        
        
        
        /*String str="";
        while(n>0)
        {
            int div=n%10;
            n=n/10;
            str=str+div;
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            char c=str.charAt(i);
        switch(c)
        {
            case '1': System.out.print("One "); break;
            case '2': System.out.print("Two "); break;
            case '3': System.out.print("Three "); break;
            case '4': System.out.print("Four "); break;
            case '5': System.out.print("Five "); break;
            case '6': System.out.print("Six "); break;
            case '7': System.out.print("Seven "); break;
            case '8': System.out.print("Eight "); break;
            case '9': System.out.print("Nine "); break;
            case '0': System.out.print("Zero "); break;
            default:System.out.print("Undefined value"); break;
        }
    }*/
        
        /*int m=n,pal=0;
        while(n>0)
        {
            int div=n%10;
            n=n/10;
            pal=pal*10+div;
        }
        if(m==pal)
        System.out.println("Given number is an Palindrome number :");
        else
        System.out.println("It is not a palindrome number");*/
        
        
        
        
        /*int m=0;
        while(n>0)
        {
            int div=n%10;
            m=m*10+div;
            n=n/10;
        }
        System.out.println(m);*/
        
        
        
        /*int m=n;
        int armstrong=0;
        while(n>0)
        {
            int div=n%10;
            n=n/10;
            int r=div*div*div;
            armstrong=armstrong+r;
        }
        if(m==armstrong)
        {
            System.out.println("Given number is an armstrong number :");
        }
        else
        {
            System.out.println("Given number is not an armstrong number :");
        }*/




        /*int digit=0;
        while(n>0)
        {
            int div=n%10;
            n=n/10;
            System.out.println("digits of the given number "+n+" is :"+div);
            digit++;
        }   System.out.println(digit);   */  
       
        /*factorial of a number 
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            System.out.println("Factorial of "+i+"! is :"+fact);
        }*/

        /*int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" is: "+sum);*/


    }
}