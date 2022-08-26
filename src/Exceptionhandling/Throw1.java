package Exceptionhandling;

import java.util.Scanner;

public class Throw1 {
	public static void validvoter(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("You are not Eligible");
		}
		else
		{
			System.out.println("You Are Eligible");
		}
	}
public static void main(String arg[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Your Age");
	int age =sc.nextInt();
	validvoter(age);
			
	
}
}
