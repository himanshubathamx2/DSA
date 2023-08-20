package Recursion;

public class Factorial
{
	public static void main(String[] args)
	{
		System.out.println(fact(4));
	}	
	public static int fact(int n)
	{
		int fact=1;
		if(n<1)
			return 1;
		else
		{
			fact=n*fact(n-1);
		}
		return fact;
	}
}


