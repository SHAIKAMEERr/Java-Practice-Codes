import java.util.*;
public class Formatting
{
public static void main(String []args)
{
int i=10;
float f=20.20f;
char c='A';
System.out.printf("%d %f %c \n",i,f,c);
System.out.printf("%1$d, %2$f ,%3$c \n",i,f,c );
System.out.printf("%1$d,%1$o,%1$x",i);
}}