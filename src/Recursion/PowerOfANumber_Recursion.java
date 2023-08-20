package Recursion;

public class PowerOfANumber_Recursion
{
  static int pow;
	public static void main(String[] args)
	{
		System.out.println(power(4, 3));	
	}

	public static int power(int n, int power)
	{
		
		if(power==0)
			return 1;
		else
		{
			pow=n*power(n, power-1); 
		}
			
		return pow;
	}
	
}
// 2*2 * 2