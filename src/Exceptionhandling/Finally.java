package Exceptionhandling;

public class Finally {
public void divide(int a, int b)
{
	try
	{
		int c =a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	finally
	{
		System.out.println("Rahul");
	}
	System.out.println("hello");
}
public static void main(String arg[])
{
	Finally ex =new Finally();
	ex.divide(10, 0);
}
}
