package DivideNConquer.ZeroOneKnapsack;

public class cl
{
	public static void main(String[] args)
	{
		ZeroOneKnapsack z= new ZeroOneKnapsack();
		int[] profits= {31,26,17,72};
		int[] weights= {3,1,2,5};
		int maxProfit=z.knapSack(profits, weights, 7);
		System.out.println(maxProfit);
	}
}
