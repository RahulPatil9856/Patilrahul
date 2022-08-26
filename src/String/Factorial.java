package String;

public class Factorial 
{
	int fact=1;
	int no=5;
	int calfact( int no)
	{
		
	if(no>=1)
	{
		fact=fact*no;
	calfact(no-1);


	}
	return fact;
	}
	public static void main(String args[])
	{
		Factorial s=new Factorial();
		//int no=5;
		int result=s.calfact(5);
		System.out.println(result);
	}

	
		
	

}
