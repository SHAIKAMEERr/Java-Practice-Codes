import java.util.*;
class Operations
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int q,pos=1;
int r=s.nextInt();
int n=s.nextInt();
q=Math.abs(n);
System.out.println("1.position of the digits");
while(q>0)
{
r = q % 10;
switch(pos)
{
case 1:
System.out.println("\t"+r+"ones");
break;
case 2:
System.out.println("\t"+r+"tens");
break;
case 3:
System.out.println("\t"+r+"hundreds");
break;
case 4:
System.out.println("\t"+r+"thousands");
break;
default:
System.out.println("the given number is more than 5 digits values");
}
System.out.println("2.To check odd or even");
if(n%2==0)
{
System.out.println("the given number is even");
}
else
{
System.out.println("given the number is odd");
}
System.out.println("3.coefficient");
}
}
}