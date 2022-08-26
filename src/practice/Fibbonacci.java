package practice;

public class Fibbonacci {
	public static void main (String arg[])
	{
		int a =0; int b= 1;
		int c;
		
		for(int i=1; i<=10; i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
