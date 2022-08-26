package abstraction;

public class Problem {

	public static void main(String[] args) {
		int a = 123;
		int revese = 0;
		while(a!=0)
		{
			int rem = a%10;
			revese = revese*10+rem;
			a = a/10;
			
		}
		  System.out.println(revese);
	}
	

}
