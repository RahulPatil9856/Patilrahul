package MultiThreading2;

public class Rushi extends Thread{
	BookThreaterApp b;
	int seat;
	Rushi(BookThreaterApp b,int seat)
	{
		this.b =b;
		this.seat=seat;
	}
	public void run()
	{
		b.bookSeat(seat);
	}

}

