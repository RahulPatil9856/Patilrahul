package MultiThreading2;

public class TotalEarning extends Thread {
	int total =0;
	public void run()
	{
		synchronized(this)
		{
		for(int i=1; i<=10;i++)
		{
			total = total+100;
		}
		this.notify();
		}
	}
	public static void main(String arg[]) throws InterruptedException
	{
		TotalEarning t1 = new TotalEarning();
		t1.start();
		
		synchronized(t1)
		{
			t1.wait();
			System.out.println("Total Earning "+ t1.total);
		}
	}

}

