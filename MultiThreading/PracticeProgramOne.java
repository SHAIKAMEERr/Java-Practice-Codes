import java.util.*;
class PracticeProgramOne
{
    public static void main(String []args)
    {
       /*  System.out.println("Java program to calculate area of triangle :");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the triangle :");
        float l=sc.nextFloat();
        System.out.println("enter the bridth of the triangle :");
        float b=sc.nextFloat();
        System.out.println("Enter the height of the triangle : ");
        float h=sc.nextFloat();
        float areaOfTriangle=(l*b*h)/2;
        System.out.println("Area of the triangle of the given values are : "+areaOfTriangle);
        */

        /*System.out.println("Java program to perform arithematic operations : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1=sc.nextInt();
        System.out.println("Enter Second number ");
        int n2=sc.nextInt();
        System.out.println("Enter the operation which you wants to perform : ");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplaction");
        System.out.println("4. Modulo Division");
        System.out.println("5. Division");
        System.out.println("6. Square ");
        System.out.println("7. roots");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Your choice is Addition :");
            System.out.println("Addition of "+n1+" And "+n2+"is :"+(n1+n2));
        }
        else if(ch==2)
        {
            System.out.println("Your choice is Subtraction :");
            System.out.println("Subtrtion of "+n1+" And "+n2+"is :"+(n1-n2));
        }
        else if(ch==3)
        {
            System.out.println("Your choice is Multiplaction :");
            System.out.println("Multiplaction of "+n1+" And "+n2+"is :"+(n1*n2));
        }
        else if(ch==4)
        {
            System.out.println("Your choice is Modulo Division :");
            System.out.println("Modulo Division of "+n1+" And "+n2+"is :"+(n1%n2));
        }
        else if(ch==5)
        {
            System.out.println("Your choice is Division :");
            System.out.println("Division of "+n1+" And "+n2+"is :"+(n1/n2));
        }
        else if(ch==6)
        {
            System.out.println("Your choice is Square :");
            System.out.println("Square of "+n1+" And "+n2+"is :"+(n1*n1)+" & "+(n2*n2));
        }
        else if(ch==7)
        {
            System.out.println("Your choice is Roots :");
            System.out.println("Roots of "+n1+" And "+n2+"is :"+Math.sqrt(n1)+" & "+Math.sqrt(n2));
        }
        else
        {
            System.out.println("you selected a wrong choice :");
        }*/

        
        /*System.out.println("Java program for Quadratic equation :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a=sc.nextInt();
        System.out.println("enter the value of x :");
        int x=sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=sc.nextInt();
        System.out.println("Enter the value of c :");
        int c=sc.nextInt();
        float QuadraticEquation=((a*(x*x))+(b*x)+c);
        System.out.println("Quadratic equation of the given numbers are :"+QuadraticEquation);*/

        /*System.out.println("Java program to find roots of the quadratic equation : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of b :");
        int b=sc.nextInt();
        System.out.println("Enter the value of A: ");
        int a=sc.nextInt();
        System.out.println("enter the value of c :");
        int c=sc.nextInt();
        double rootsOfQuadraticEuation =((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        double rootsOfnegativeQuadraticEuation =((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println("Roots of given numbers are : "+rootsOfQuadraticEuation);
        System.out.println("Roots of given numbers are : "+rootsOfnegativeQuadraticEuation);*/

        
       /*  System.out.println("JAva program for bit masking :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of N :");
        int n=sc.nextInt();
        System.out.println("Enter the position which you wants to check a bit : ");
        int pos=sc.nextInt();
        int mask=1<<pos;
        int not=~(mask);
        System.out.println("Choose the task to perform  :");
        System.out.println("1. Get Bit");
        System.out.println("2. Set Bit");
        System.out.println("3. Clear Bit");
        System.out.println("4. Update Bit");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Your choice is to perform Get Bit :");
            if((n&mask)==0)
            {
                System.out.println("Bit is off '0' "+(n&mask));
            }
            else
            System.out.println("Bit is ON...! "+(n&mask));
        }
        else if(ch==2)
        {
            System.out.println("Your choice is to perform Set Bit : ");
            if((n|mask)==0)
            {
                System.out.println("Bit is OFF...!"+(n|mask));
            }
            else
            System.out.println("YOur bit is ON...! "+(n|mask));
        }
        else if(ch==3)
        {
            System.out.println("Your choice is to perform clear Bit :");
            if((n&not)==0)
            {
                System.out.println("Your bit is 0"+(n&not));
            }
            else
            System.out.println("Bit is sucessfully cleared...!"+(n&not));
        }
        else if(ch==4)
        {
            System.out.println("Your choice is to perform Update Bit ");
            System.out.println("1. To convert 0 to 1 ");
            System.out.println("2. To convert 1 to 0 ");
            System.out.println("Select the task which you want to perform :");
            if((n|mask)==1)
            {
                System.out.println("Sucessfully converted the bit from 0 to 1 :"+(n|mask));
            }
            else if((n&not)==0)
            {
                System.out.println("You have sucessfully converted the bit from 1 to 0"+(n&not));
            }
        }
        else
        {
            System.out.println("You selected a wrong option : ");
        }*/

       /*  System.out.println("Java Program to perform WIDENING & NARROWING...!");
        byte b=101;
        int i=b;
        short s=(short)i;
        long l=(byte)b;
        double d=123456012.1234453d;
        short s1=(short)d;
        System.out.println(s1);*/


       /*  System.out.println(" Java program to perform printing statements : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.format("%05d",n);*/


        /*System.out.println("Java program to perform String Functions :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a First String :");
        String s=sc.nextLine();
        System.out.println("Enter the value of second String :");
        String s1=sc.nextLine();
        System.out.println(s1.trim());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s.substring(3));
        System.out.println(s1.substring(3,6));
        System.out.println(s.startsWith( s1, 'A'));
        //1.length, 2.trim, 3.substring, 4.indexOf, .lastIndexOf,*/

        
        System.out.println("Java program to find email format :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your email id :");
        String email=sc.nextLine();
        boolean b=email.matches("[^A-Z]");
        if(b!=false)
        {
            char at=email.charAt('@');
            String s=email.substring(0,at-1);
            String s1=email.substring(at+1,'.');
            String s2=email.substring('.');
            System.out.println("User name of Your Email-ID is : "+s);
            System.out.println("Domaine of your Email-Id is : "+s1);
            System.out.println("Type of your Email-ID is : "+s2);
        }
        else
        {
            System.out.println("Email id cannot be able to store in Capital Letters :");
        }

    }
}