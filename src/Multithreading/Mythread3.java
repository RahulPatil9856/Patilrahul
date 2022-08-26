package Multithreading;

public class Mythread3 extends Thread {
public static void main(String aarg[])
{
	Mythread3 m1= new Mythread3();
	Mythread3 m2= new Mythread3();
	Mythread3 m3 = new Mythread3();
	m1.start();
	m2.start();
	m3.setDaemon(true  );
	m3.start();
}
	public void run()
	{
		for(int i=0; i<10; i++)
			System.out.println("Thread Running "+i+Thread.currentThread().getName());
		
	}
}

