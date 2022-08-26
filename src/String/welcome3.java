package String;

public class welcome3 {
	public static void main(String args[])
	{
		String a="welcome to world java";
		int count =countN(a);
		System.out.println(count);

	}

 static int countN(String s)
	{
	String a="welcome to world java";
	int count =1;
for(int i=0; i<a.length(); i++)
{

	if(a.charAt(i)==' ')
	{
		count++;
		
	}
																											
}
return count;
	}
	

	
}	

