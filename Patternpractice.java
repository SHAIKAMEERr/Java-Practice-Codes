import java.util.*;
class Patternpractice
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of rows :");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=n;j>=i;j--)
        {
            System.out.print(" "+j);
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
      }
      
      
      
      
      
      
      
      
        /*Scanner sc=new Scanner(System.in);
      System.out.println("Enter No of Rows :");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=n;j++)
        {
            System.out.print(" *");
        }
        System.out.println();
      }*/

      
      
      
      
      
      
      
      
      
      
      
      
        /*Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of Rows :");
      int row=sc.nextInt();
      for(int i=1;i<=row;i++)
      {
        for(int j=1;j<=i;j++)
        {
            //to print half pyramid from left to right
           System.out.print(" *");
        }
        for(int j=1;j<=2*(row-i);j++)
        {
            //to print spaces 
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++)
        {
            //to print half pyramid from right to left
            System.out.print(" *");
        }
        System.out.println();
      }
      
      
      for(int i=row;i>=1;i--)
        //to print send half pyramid 
      {
       for(int j=1;j<=i;j++)
        //to print downside pyramid from left to right
       {
        System.out.print(" *");
       }
        for(int j=1;j<=2*(row-i);j++)
        {
            //to print spaces down side
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++)
        {
            //to print downside pyramid from right to left
            System.out.print(" *");
        }
        System.out.println();
      }*/
      
      
      
      
      
      
      /*for(int i=1;i<=row;i++)
      {
        for(int j=1;j<=i;j++)
        {
            if((i+j)%2==0)
            {
                System.out.print("1 ");
            }
            else
            {
                System.out.print("0 ");
            }
        }
        System.out.println();
      }*/
      
      
      
      
      /*int n=1;
      for(int i=1;i<=row;i++)
      {
        for(int j=1;j<=i;j++)
        {
            System.out.print(n+" ");
            n++;
        }
        System.out.println();
      }*/
      
      
      
      
      /*for(int i=1;i<=row;i++)
      {
        for(int j=1;j<=row-i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
      }*/
      
      
      
      /*for(int i=1;i<=row;i++)
      {
        for(int j=1;j<=i;j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
      }*/
     
     
     
     
     
     
     
     
      /*  for(int i=1;i<=row;i++)
      {
        for(int j=1;j<=row-i;j++)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
      }*/
      
      
      
      
      
      
        /*Scanner sc=new Scanner(System.in);
      System.out.println("enter no of rows :");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=n;j>=i;j--)
        {
            System.out.print("* ");
        }
        System.out.println();
      }*/
      
      
      
      
        /*Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of Rows: ");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
      }*/
      
      
      
      
        /*Scanner sc=new Scanner(System.in);
       System.out.println("Enter no of Rows");
       int n=sc.nextInt();
       System.out.println("enter the no of Columns");
       int m=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=m;j++)
        {
            if(i==1||i==n||j==1||j==m)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
        System.out.println();
       }*/
       
       
       
       
       
       
       
        /*Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number rows:");
       int n=sc.nextInt();
       System.out.println("Enter no of columns :");
       int m=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=m;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
       }*/
       
       
       
       
       
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int n=sc.nextInt();
        for(int i=n;i>=n;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
        
        
        
        
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter no of Rows :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        
        
        
        /*inverted half pyramid
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Rows :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
               System.out.print("* ");
            }
            System.out.println();
        }*/

        
        
        
        
        
        /* Half Pyramid
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/






       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int n=sc.nextInt();
        System.out.println("enter no of columns");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/ 



       /* Hollow Rectangle
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Rows :");
        int n=sc.nextInt();
        System.out.println("Enter no of columns :");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || i==n|| j==1 || j==m)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
    }
}