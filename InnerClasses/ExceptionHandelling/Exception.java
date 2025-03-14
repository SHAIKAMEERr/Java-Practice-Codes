class Exception
{
       int a;
       int b;
       try
       {
           int c=a/b;
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       finally
       {
           System.out.println("Divide two numbers  ");
       }
}
