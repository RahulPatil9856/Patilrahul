package Multithreading;

public class Printer {
public synchronized void printing(String str)
{
	System.out.println("Printing started " + str);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Printing Completed "+str);
}
}
