package practice;

public class Adder1  {
	void add(int a,int b)
	{
		System.out.println("1st");
		System.out.println(a+b);
	}
	void add (int d, double e)
	{
		System.out.println("2nd");
		System.out.println(d+e);
	}
	public static void main(String args[])
	{
		Adder1 a1=new Adder1();
		Adder a2=new Adder();
		System.out.println(a2.ad);
		
		a1.add(10,20);
		a1.add(30,7.5);
	}
}