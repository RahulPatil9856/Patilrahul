package abstraction;   //abstraction using abstract method

abstract class Bank
{
		abstract double getInterestRate();              //abstraction method is also known as 0-100% abstraction method
}
class Sbi extends Bank
{
double getInterestRate()
{
	return 8.15;
}
}
public class Bob extends Bank
{
double getInterestRate()
{
return 9.15;	
}
public static void main(String args[])
{
Bank b1 = new Sbi();
Bank b2=new Bob();
b1.getInterestRate();
System.out.println(b1.getInterestRate());
b2.getInterestRate();
System.out.println(b2.getInterestRate());
}
}

