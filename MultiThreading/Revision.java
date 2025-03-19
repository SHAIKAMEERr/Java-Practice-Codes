import java.util.Scanner;
import java.util.ArrayList;
class Revision
{
    public static void main(String args[])
    {
        System.out.println("Revising the java programs which i have done previously one by one : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the Program based on the number : ");
        System.out.println("1. Bit Manuplation : ");
        System.out.println("2. E- Mail");
        System.out.println("3. ArrayList");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Java Program to perform bit manuplation :");
            System.out.println("select the sub program :");
            System.out.println("1. Get Bit ");
            System.out.println("2. Set Bit ");
            System.out.println("3. Clear Bit ");
            System.out.println("4. Update Bit");
            int ch=sc.nextInt();
            System.out.println("Enter a number : ");
            int num=sc.nextInt();
            System.out.println("Enter the position on which you perform task :");
            int pos=sc.nextInt();
            int mask=1<<pos;
            if(ch==1)
            {
                System.out.println("In bit manuplation you are performing Get Bit operation : ");
                int getBit=num&mask;
                System.out.println("Get bit ="+getBit);
                if(getBit==0)
                {
                    System.out.println("Bit is off ");
                }
                else
                {
                    System.out.println("Bit is on ");
                }
            }
            else if(ch==2)
            {
                System.out.println("In bit manuplation you are performing Set Bit Operation :");
                int setBit=num|mask;
                System.out.println(setBit);
                if(setBit==0)
                {
                    System.out.println("Bit is off ");
                }
                else
                {
                    System.out.println("Bit is on ");
                }
            }
            else if(ch==3)
            {
                System.out.println("In bit manuplation you are performing clear bit operation ");
                int n=~(mask);
                int clearBit=num&n;
                System.out.println(clearBit);
                if(clearBit==0)
                {
                    System.out.println("Bit is off");
                }
                else
                {
                    System.out.println("Bit is on");
                }
            }
            else if(ch==4)
            {
                System.out.println("in bit manuplation you are performing update bit operation ");
                System.out.println("choose the task you like to perform :");
                System.out.println("1. to convert from 0 to 1");
                System.out.println("2. to convert 1 to 0 ");
                int c=sc.nextInt();
                if(c==1)
                {
                    int updateBit=num|mask;
                    System.out.println(updateBit);
                    if(updateBit==0)
                    {
                        System.out.println("Bit is OFF ");
                    }
                    else
                    {
                        System.out.println("Bit is ON");
                    }
                }
                else if(c==2)
                {
                    int updateBit=num&(~(mask));
                    System.out.println(updateBit);
                    if(updateBit==0)
                    {
                        System.out.println("Bit is OFF");
                    }
                    else
                    {
                        System.out.println("Bit is ON");
                    }
                }
            }
        }
        else if(choice==2)
        {
            System.out.println("Java Program to perform regex and string operations ");
            System.out.println("Enter an email ");
            String email=sc.nextLine();
            email.matches("[a-z 0-9]*//S(^[`!#$%^&*()])");
            int c=email.indexOf("@");
            String userName=email.substring(0,c);
            String domain=email.substring(c+1,email.lastIndexOf("."));
            int x=email.lastIndexOf(".");
            String typeOfEmail=email.substring(x);
            switch(typeOfEmail)
            {
                case "com":
                System.out.println("It is commercial email");
                case "in":
                System.out.println("It is indian mail");
                case "gov":
                System.out.println("It is a government Mail ");
                case "edu":
                System.out.println("It is a type of educational Mail");
            }
        }
        else if(choice==3)
        {
            System.out.println("java Program to Practice ArrayList ");
            ArrayList<Integer> al=new ArrayList<>();
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(4);
            al.add(6);
            al.add(6);
            al.add(7);
            al.add(8);
            al.add(9);
            System.out.println(al);
            System.out.println(al.get(4));
            al.set(4,5);
            System.out.println(al);
            al.sort(null);
            System.out.println(al);
            System.out.println(al.indexOf(9));
            for(int x:al)
            {
                System.out.print(x);
            }
            al.subList(0,4);
            System.out.println(al);
            al.clear();
            System.out.println(al);

        }
    }
}