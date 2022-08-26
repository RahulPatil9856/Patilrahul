package MultiThreading2;

public class Rahul extends Thread {
	BookThreaterApp b;
	int seat;
	Rahul(BookThreaterApp b, int seat)
	{
		this.b =b;
		this.seat =seat;
	}
	public void run()
	{
		b.bookSeat(seat);
	}

}
