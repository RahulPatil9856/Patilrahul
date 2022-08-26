package String;

public class Sample
{                                                //this program for string reverse using recursion method.
	String reverse(String a)                    //in recursion method called itself.
	{
		if(a.length()<=0)
		{
			return a;
		}
		return reverse (a.substring(1))+a.charAt(0);
	}
public static void main(String args[])
{
	Sample b=new Sample();
	b.reverse("Rushikesh");
    System.out.println(b.reverse("Rushikesh"));
}
}
