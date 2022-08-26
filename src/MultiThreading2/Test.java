package MultiThreading2;

public class Test {
public static void main(String arg[])
{
	BookThreaterApp b1 = new BookThreaterApp();
	Rahul r1 = new Rahul(b1,7);
	BookThreaterApp b2 = new BookThreaterApp(); // when we creat Second Object of BookThreaterApp then we have to use static Synchronized 
	Rushi r2 = new Rushi(b2,8);
	r1.start();
	r2.start();
	
}
}
