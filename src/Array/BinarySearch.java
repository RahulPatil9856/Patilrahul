package Array;
import java.util.Scanner;
public class BinarySearch {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	int a[]= {1,2,5,8,10,15,26,30,32,35,39,42,44,50,65,90};
	System.out.println("Select value from below array");
for(int v:a)
	{
	
System.out.print(v+" ");
	}
//System.out.println(a.length-1);	
int srch=sc.nextInt();
int li=0;
int hi=a.length-1;
int mi=(li+hi)/2;

while(li<=hi)
{
if(a[mi]==srch)	
{
	System.out.println(mi);
	break;
}
else if(a[mi]<srch)
{
	li=mi+1;
}
else
{
	hi=mi-1;
}
mi=(li+hi)/2;
}
if(li>hi) 
{
	System.out.println("Element is not found");
}
}
}
