package Recursion;

public class GCD_Recursion
{
	static int rem;
    static int tmp;
	
	public static void main(String[] args)
	{
		System.out.println(gcd(48,18));
	}
	
	public static int gcd(int m , int n)
	{
	 		tmp=rem;
	 		rem= m%n;
	 		if(rem==0)
	 			return tmp;
	 		else
	 			{
	 				gcd(n,rem);
	 				return 0;
	 			}
	 }
	
	
	
	/* 
	 *48  18   rem =12   
	 *18  12   rem = 6      
	 *   
	 * 
	*/
	/*
	 * Euclidean algorithm
	 * gcd(48,18)
	 * step1: 48/18 = rem 12
	 * step2: 18/12 = rem 6
	 * step3: 12/6 =  rem 0
	 * Answer is 6 
	 *
	 */

}
