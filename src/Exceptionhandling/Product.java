package Exceptionhandling;

import java.util.Scanner;

public class Product {
void validProduct(int ExpiryDate) throws InvalidProductException
{
	if(ExpiryDate>=30)
	{
		throw new InvalidProductException("Product is Expired");
	}
	else 
	{
		System.out.println("Product Is Safe");
	}
}
public static void main(String arg[])
{
	Product p1 = new Product();
	Scanner sc =new Scanner(System.in);
	int a =sc.nextInt();
	try
	{
		p1.validProduct(a);
	}
	catch(InvalidProductException e)
	{
		System.out.println(e.getMessage());
	}
}
}
