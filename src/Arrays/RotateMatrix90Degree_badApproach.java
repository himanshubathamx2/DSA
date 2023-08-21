package Arrays;

public class RotateMatrix90Degree_badApproach
{

	public static void main(String[] args)
	{ 
		int m=3,n=3;
		int[][] mt = new int[m][n];
		mt[0][0]=33; mt[0][1]=44; mt[0][2]=55; 
		mt[1][0]=10;mt[1][1]=11;mt[1][2]=12;
		mt[2][0]=20; mt[2][1]=21; mt[2][2]=22;
		
		printMatrix(mt,m,n);
		
	   System.out.println("After rotating to 90 degree"); 
       int mt_r[][]=new int[m][n];
       mt_r= rotate(mt,m,n);
	}
	
	public static int[][] rotate(int[][] mt,int rows, int cols)
	{
		for(int i=0;i<cols;i++)
		{
			for(int j=rows-1;j>=0;j--)
			{
				System.out.print(mt[j][i]+"|");
			}
			System.out.println();
		}
		return null;
	}

	public static void printMatrix(int[][] mt, int rows, int cols)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(mt[i][j]+"|");
			}
			System.out.println();
		}
       
	}
	
}
