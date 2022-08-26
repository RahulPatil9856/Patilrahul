package practice;

public class Revesreallstring {

	public static void main(String arg[])
	{
		String str = "im an automation engineer";
		
		String[] word = str.split(" ");
		
		String reverseString ="";
		
		for(String allw:word)
		{
			String rever = "";
			for(int i=allw.length()-1; i>=0; i--)
			{
				rever = rever+allw.charAt(i);
			}
			
			rever=reverseString+rever+" ";
			System.out.print(rever);
		}
	}
}
