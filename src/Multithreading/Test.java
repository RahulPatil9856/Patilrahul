package Multithreading;

public class Test {
public static void main(String arg[])
{
	Printer print = new Printer();
	RahulThread r1 = new RahulThread(print);
	AniketThread a1 = new AniketThread(print);
    RushikeshThread rushi = new RushikeshThread(print);
    r1.start();
    a1.start();
    rushi.start();
}
}
