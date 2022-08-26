package MultiThreading2;

public class BookThreaterApp {
static int totalSeat = 20;
	public static synchronized  void bookSeat(int seat)
	{
		//System.out.println(" heloo");
		//synchronized(this)  // we use synchronized block for if we want only particular code synchronized  so waiting Time for thread decrease
		//{               this can be used as current object reference
		if(totalSeat>=seat)
		{
			System.out.println("SEAT BOOKED SUCCESSFULLY "+seat);
			totalSeat=totalSeat-seat;
			System.out.println("Seat left"+totalSeat);
		}
		else
		{
			System.out.println("Seat can not Booked");
			System.out.println("Seat left"+totalSeat);
		}
		//}
	}

}
