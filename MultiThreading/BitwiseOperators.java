import java.lang.*;
class BitwiseOperators
{
public static void main(String args[])
{
int a=10,b=6,c,d,e,f,g,h,i,j,k,l,m;
c=a&b;
d=a|b;
e=a<<2;
f=b<<2;
g=a>>2;
h=b>>2;
i=a>>>1;
j=b>>>1;
k=~a;
l=~b;
m=a^b;
System.out.println("and operation of a,b is : "+c);
System.out.println("or operation of a,b is : "+d);
System.out.println("left shift operation of a is : "+e);
System.out.println("left shift operation of b is : "+f);
System.out.println("right shift operation of a is : "+g);
System.out.println("right shift operation of b is : "+h);
System.out.println("unsigned right shift  operation of a is : "+i);
System.out.println("unsigned right shift operation of b is : "+j);
System.out.println("NOT operation of a is : "+k);
System.out.println("NOT operation of b is : "+l);
System.out.println("XOR operation of a,b is : "+m);
}
}