package Array;

public class Sample4 {
	public static void main(String gargs[])
	{
		int a[]= {2,6,1,3,10};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("EVEN="+a[i]+",");
			}else 
			{
				System.out.print("ODD="+a[i]+",");
			}
			
		}
	}

}
