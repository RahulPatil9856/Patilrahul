package String;



public class FactorialUsingForLoop {
	public static void main(String args[])
	{
		int no=6;int fact=1;
		for(int i=1;i<=no;i++)     //for(int i=no;i>=1;i--)     also this for loop is used.
		{
		System.out.print(i+"*");
		fact=fact*i;	
		}
		System.out.println("="+fact);
		
	}

}
