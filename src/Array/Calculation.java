package Array;

public class Calculation {
	int addition(int a, int b)
	{
		return a+b;
	}
	int substraction(int a, int b)
	{
		return a-b;
		
	}
	public static void main(String args[])
	{
		Calculation c1 = new Calculation();
		System.out.println(c1.addition(10,20));
		System.out.println(c1.substraction(10,20));
	}

}
