package practice;

class Parent 
{
	void shop()
	{
	 System.out.println("Parent shop");
	}
}
class Child extends Parent
{
	void shop()
	{
	System.out.println("My Shop");
	}
}
public class App
{
public static void main(String args[])
{
Parent p1=new Child();
p1.shop();
}
}