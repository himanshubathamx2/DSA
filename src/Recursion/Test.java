package Recursion;

public class Test
{
	public static void m1()
	{
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				System.out.println(arr[i]+ " "+arr[j]);	
			}
		}
	}
	public static void main(String[] args)
	{
		m1();
	}
}
