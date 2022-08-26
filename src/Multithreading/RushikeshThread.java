package Multithreading;

public class RushikeshThread extends Thread {
	Printer print;
	RushikeshThread(Printer print)
	{
		this.print=print;
	}
	public void run()
	{
		System.out.println("Running");
		print.printing("Print My Resume - Rushikesh");
	}

}
