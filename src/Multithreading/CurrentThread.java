package Multithreading;

public class CurrentThread {
public static void main(String arg[])
{
	//System.out.println(10/0);
	//System.out.println("hello");
	//System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("Rahul");
	System.out.println(Thread.currentThread().getName());
	System.out.println(10/0);
	
}
}
