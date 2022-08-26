package Multithreading;

public class RahulThread extends Thread{
	Printer print;
	RahulThread(Printer print)
	{
		this.print=print;
	}
	public void run()
	{
		System.out.println("Runnig");
		print.printing("Print My Resume - Rahul");
	}

}
