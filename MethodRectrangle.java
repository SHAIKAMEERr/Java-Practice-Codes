import java.util.Scanner;
class Rectrangle
{
    double length;
    double breadth;
    double areaOfRectrangle()
    {
        return length*breadth;
    }
    double perimeterOfRectrangle()
    {
        return 2*areaOfRectrangle();
    }
    boolean isSquare()
    {
        return (length==breadth);
    }
}
class RectruanglePractice
{
    public static void main(String[] args)
    {
        Rectrangle rl=new Rectrangle();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectrangle : ");
        rl.length=sc.nextDouble();
        System.out.print("Enter Breadth of The Rectrangle : ");
        rl.breadth=sc.nextDouble();
        System.out.println("Area od the Rectrangle : "+rl.areaOfRectrangle());
        System.out.println("Perimeter of the Rectrangle : "+rl.perimeterOfRectrangle());
        if(rl.isSquare()==true)
        {
            System.out.println("Both Leangth and breadth are Equal..! ");
        }
    }
}
        