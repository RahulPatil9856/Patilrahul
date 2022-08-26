package practice;
import java.util.Scanner;
public class Adder {
	 public int ad=10;
static void add(int a,int b )
{
	System.out.println("First two digit number addition");
System.out.println(a+b);	
}
static void add(int a,int b, int c)
{
System.out.println("three digid number addition");	
System.out.println(a+b+c);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
int a=sc.nextInt();
 int b=sc.nextInt();
int c=sc.nextInt();
Adder.add(a,b);
Adder.add(a,b,c);
}
}
