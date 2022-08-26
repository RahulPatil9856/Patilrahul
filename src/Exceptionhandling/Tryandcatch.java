package Exceptionhandling;

public class Tryandcatch {
public void divide(int a, int b)
{
	try
	{
		int c= a/b;
		System.out.println(c);
		System.out.println("1");
	}
	catch (ArithmeticException e1)
	{
		System.out.println("Cant divide By Zero");
	}
}
public static void main(String arg[])
{
	Tryandcatch ex = new Tryandcatch();
	ex.divide(10,0);
}
}
