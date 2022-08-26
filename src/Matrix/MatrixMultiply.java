package Matrix;

public class MatrixMultiply {
	public static void main(String args[])
	{
		int a[][]= {{1,2,6},{4,5,7},{10,12,15}};
		int b[][]= {{5,0,9},{2,3,5},{9,3,1}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{ 
				for(int k=0;k<3;k++)
				{
				c[i][j]=c[i][j]+a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
