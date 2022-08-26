package Exceptionhandling;

public class Tryandcatch2 {
public void divide(int a, int b)
{
	try
	{
		int c=a/b;
		System.out.println(c);
	}
/*	catch(NullPointerException e1)
	{
		System.out.println("NullPointer Exception occured");
	}
	catch(ArithmeticException e2)
	{
		System.out.println("Arithmetic Exception occured");
	}
	catch(Exception e3)     first write Child class then Parent class
	{
		System.out.println("Exception occured");
	}*/
	catch(NullPointerException | ArithmeticException e ) // multipleException can take but not Parent class 
	{
		System.out.println("Cant divide");
	}
}
public static void main(String arg[])
{
	Tryandcatch2 ex =new Tryandcatch2();
	ex.divide(10, 0);
}
}
