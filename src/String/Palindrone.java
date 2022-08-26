package String;

import java.util.Scanner;

public class Palindrone {
public static void main(String arg[])
{
	String str;
	Scanner sc=new Scanner(System.in);
     String reverse = "";
    
   do
   {
	   System.out.println("Is variable is palindrone");
	   String  s1 =sc.next();
     for(int i=s1.length()-1; i>=0; i--)
     {
    	 reverse = reverse + s1.charAt(i);
     }
    	 
    	 if(reverse.equals(s1))
    	 {
    		 System.out.println("yes");
    		 
    	 }
    	 else
    	 {
    		 System.out.println("no");
    	 }
    	System.out.println("Want to check again"); 
    	 str=sc.next();
   }
   while(str.equalsIgnoreCase("Yes"));
    
}
}
