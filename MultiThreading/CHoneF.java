import java.util.*;
class CHoneF
{
    public static void main(String []args)
    {
        System.out.println("Cuboid Proogram");
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the Length of the Cuboid : ");
        float l=n.nextFloat();
        System.out.println("Enter bridth of the Cuboid : ");
        float b=n.nextFloat();
        System.out.println("Enter the height of the Cuboid : ");
        float h=n.nextFloat();
        Float c=l*b*h;
        float totalArea=2*(l*b+l*h+b*h);
        System.out.println("Volume of cuboid is : "+c);
        System.out.println("Total Area of Cuboid is : "+totalArea);
        
    }
}