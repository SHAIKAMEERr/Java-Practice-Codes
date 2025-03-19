import java.util.Scanner;
class VarArgsTwo
{
    static float Discount(float ...x)
    {
        float sum=0;
        float discount=0;
        for(float a:x)
        {
            sum=sum+a;
        }
        System.out.println("Sum = "+sum);
        if(sum<500)
        {
            discount=sum/1.0f;
        }
        else if(sum>=500 && sum<1000)
        {
            discount=sum*0.15f;
        }
        else if(sum>=1000 && sum<1500)
        {
            discount=sum*0.20f;
        }
        else if(sum>=1500)
        {
            discount=sum*0.25f;
        }
        return discount;
    }
    public static void main(String[] args)
    {
        System.out.println(Discount(123,456,87));
        System.out.println(Discount(43,76,89));
        System.out.println(Discount(564,123,231,435,765));
    }
}