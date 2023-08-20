package Recursion;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Base64;

public class SumOfDigits_Recursion
{
	static int d,sum;
	 
	public static void main(String[] args)
	{
		System.out.println(sumOfDigits(01234560));
	}
	
	public static int sumOfDigits(int n)
	{
		
		if(n==0)
		{
			return 0;
		}
		else
		{
		d=n%10;
		sum=d+sumOfDigits(n/10);
		}
		return sum;
	}
        
}

