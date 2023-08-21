package Recursion;

public class ProductOfArrayEle
{
	public static void main(String[] args)
	{
		int arr[]= new int[] {2,4,5};
		int pro = pro(arr, arr.length-1);
		System.out.println(pro);
	}
	public static int pro(int[] arr, int n)//2 4 5
	{
		if(n==0)
			return arr[n];
		else
		{
			return arr[n]*pro(arr, n-1); 
		}
	}
}
