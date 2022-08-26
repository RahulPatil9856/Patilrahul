package String;

public class Recursion {
String reverse(String str)
{
	if (str.length()<=0)
	{
		return str;
	}
	return reverse(str.substring(1))+str.charAt(0);
}
public static void main(String arg[])
{
	Recursion s1 = new Recursion();
	s1.reverse("Welcome");
	System.out.println(s1.reverse("Welcome"));
}
}


