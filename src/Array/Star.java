package Array;

public class Star {
	
	public static void main(String arg[])
	{
		int a=1;
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(a++);
			}
			System.out.println();
			for(int k=1; k<=3; k++)
			{
			System.out.print(2+a--);
		}
			System.out.println();
			}
		
	}

}
