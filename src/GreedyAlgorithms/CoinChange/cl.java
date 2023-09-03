package GreedyAlgorithms.CoinChange;

import java.util.Arrays;

public class cl
{
	public static void main(String[] args)
	{
		int coins[] = {1,2,5,10,20, 50 ,10 ,1000};
		int amount=2035;
		System.out.println("Counts Avalaible "+Arrays.toString(coins));
		System.out.println("target amount"+amount);
		CoinChangeProblem.coinChangeProblem(coins, amount);
	}
}
