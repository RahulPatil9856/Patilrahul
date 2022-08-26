package practice;

public class Star2 {
	public static void main(String arg[])
	{
		for(int i=1; i<=3; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k =1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int r=2; r<=i; r++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
