package abstraction;

interface Bank1                        //multiple inheritance possible in java  by interface 
{
	float getiR();
}
interface Reservebank
{
    float getiR();	
}
public class Hdfc implements Bank1,Reservebank
{
	  public float getiR()
	{
		return  8.75f;
	}
	public static void main(String args[])
	{
		Reservebank rb1 = new Hdfc();
		Hdfc b1=new Hdfc();
		b1.getiR();
		rb1.getiR();
		System.out.println(rb1.getiR());
		System.out.println(b1.getiR());
	}
}