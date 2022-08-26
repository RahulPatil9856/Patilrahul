package abstraction;

public class palind {
   public  static void main(String arg[])
   {
	   int r,sum =0; 
	   int temp;
	   int n = 454;
	   
	   
	   temp = n;
	   while(n>0)
	   {
		   r=n%10;
		   
		   sum = (sum*10)+r;
		   n=n/10;
		   
	   }
	   if(temp==sum)
	   {
		   System.out.println("palindrome number");
	   }
	   else
	   {
		   System.out.println("not palindrome");
	   }
   }
}
