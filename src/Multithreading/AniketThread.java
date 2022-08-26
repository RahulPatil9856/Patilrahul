package Multithreading;

public class AniketThread extends Thread {
	Printer print;
	AniketThread(Printer print)
	{
		this.print=print;
	}
	public void run()
	{
		System.out.println("Runnig");
		print.printing("Print My Resume - Aniket");
	}

}
