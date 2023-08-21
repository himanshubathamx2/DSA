package Arrays;

public class FindMissingNumber_badApproach
{
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5,6,8,9};
		System.out.println(missing(a));
	}
	
	public static int missing(int[] a)
	{
		int d=0;
		for(int i=0;i<a.length-1;i++)
		{
			if((a[i+1]-a[i])!=1)
			{
				d=a[i+1]-1;
			}
		}
		return d;
	}
}
