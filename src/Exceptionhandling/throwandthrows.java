package Exceptionhandling;

import java.util.Scanner;

public class throwandthrows  {
	public static void validvoter(int age) 
	{
		if(age<18)
		{
			throw new InvalidVoterException("You are not Eligible");
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
	try
	{
	validvoter(age);
	}	
	catch(InvalidVoterException e)
	{
		
		System.out.println(e.getMessage());
	}
	
	
}
}


