class IncorrectAgeException extends Exception
{
    @Override
    public String toString()
    {
        return "Are You Sure that your age is more than 100...?";
    }
    @Override
    public String getMessage()
    {
       return "Age Should be greater than 0 ";
    }
}
class IncorrectAge
{
    static void EnterAge(short age)throws IncorrectAgeException
    {
        if(age<0 || age>100)
            throw new IncorrectAgeException();
    }
    static void meth1(short a)throws IncorrectAgeException
    {
        EnterAge(a);
    }
}
class MainProgram
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter Your age : ");
        short age=sc.nextShort();
        try
        {
            IncorrectAge.meth1(age);
        }
        catch(IncorrectAgeException e)
        {
            if(age<0)
            {
                System.out.println(e.getMessage());
            }
            else if(age>100)
            {
                System.out.println(e);
                boolean b=sc.nextBoolean();
                if(b==true)
                {
                    System.out.println("Congrats you played a fabulous Innings ");
                }
                else
                {
                    System.out.println("Try again...! ");
                }
            }
            //e.printStackTrace();
        }
        finally
        {
         System.out.println("Program executed Sucessfully....!");
        }
    }
}
