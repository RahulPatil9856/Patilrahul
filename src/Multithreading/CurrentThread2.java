package Multithreading;

public class CurrentThread2 extends Thread  {
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("hello");
	}
	public static void main(String arg[])
	{
		 CurrentThread2  t1= new  CurrentThread2 ();
		t1.start();
		t1.setName("Rahul"); // Name Provided For Thread 0
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive()); 
		System.out.println(t1.isAlive());
	}

}
