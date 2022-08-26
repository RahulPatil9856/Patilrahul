package Multithreading;

public class Mythread implements Runnable{
	public static void main(String arg[])
	{
		Mythread m1 = new Mythread();
		Mythread m2 = new Mythread();
		Thread t1 =new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++)
		System.out.println("Thread Running "+i+ " "+ Thread.currentThread().getName());
		
	}
	

}
