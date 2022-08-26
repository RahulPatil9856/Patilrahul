package Multithreading;

public class Sleep extends Thread{
	public static void main(String arg[])
	{
		Sleep m1 = new Sleep();
		Sleep m2 = new Sleep();
		m1.start();
		m2.start();
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread Running "+i+ " "+ Thread.currentThread().getName());
		}
	}
	

}
