package Recursion;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println(pow(3,4));
	}
	public static int pow(int x, int y)
	{
		int pow=1;
		if(y<1)
			return 1;
		else
		{
			return x*pow(x,y-1);
		}
	}
}

//123
