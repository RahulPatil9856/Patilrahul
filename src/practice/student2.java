package practice;

public class student2 {
	static int addition (int a, int b)    // static is use in method so we don't need to creat object
	{
		return a+b;
	}
	public static void main (String args[])
	{
		System.out.println(addition(20,30));  //  object missing  beacause we use static for method
	}


class user{
	public static void main(String args[])
	{
		System.out.print(student2.addition(1,5));
	}
}}