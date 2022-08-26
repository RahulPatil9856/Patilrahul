package Exceptionhandling;

public class Nullpointer1 {
public static void main(String arg[])
{
	String str =null;
	try
	{
	if(str.equals("java"))
	{
		System.out.println(str);
	}
	} 
	catch(NullPointerException e)
	{
		System.out.println("Nullpointerexception");
	}
}
}
