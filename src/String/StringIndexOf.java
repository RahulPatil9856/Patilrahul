package String;

public class StringIndexOf {
	public static void main(String args[])
	{
		
	String a="Rushikesh Patil";
	//System.out.println(a.indexOf("s"));
	//String substr1=a.substring(0,5);     // |
	                                      //  |---1
	//System.out.println(substr1);          //|
	String substr2=a.substring(a.indexOf("R"),a.lastIndexOf("l"));
	System.out.println(substr2);
	//String substr3=a.substring(a.indexOf("R"),a.lastIndexOf("l")+1);
	//System.out.println(substr3);
	//System.out.println(a.concat(" "+"And Rahul and Mayur are friends.") );    //concat is used for joining two words also+ is used for that
	//System.out.println(a +" is Boss");
	
	
	}
}