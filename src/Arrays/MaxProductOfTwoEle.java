package Arrays;

public class MaxProductOfTwoEle
{
	/*
	 * How to find maximum product of two integers in the array where all elements
	 * are positive.
	 * 
	 * Example
	 * 
	 * int[] intArray = {10,20,30,40,50}; maxProduct(intArray) // (40,50)
	 */ 
	public static void main(String[] args)
	{
		int[] a =
		{ 10, 60, 30, 40, 50 };
		int a1[] = maxProduct(a);
		System.out.println(a1[0]+"  "+a1[1]);
	}
	 
	 public static int[] maxProduct(int[] a)
	 {
		 int[] proA=new int[2];
		 int pro=0;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(pro<a[i]*a[j])
				 {
				 pro=a[i]*a[j];
				 proA[0]=a[i];
				 proA[1]=a[j];
				 }
			 }
		 }
		 return proA;
	 }

}
