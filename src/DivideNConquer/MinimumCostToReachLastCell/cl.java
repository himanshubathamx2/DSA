package DivideNConquer.MinimumCostToReachLastCell;

public class cl
{
	public static void main(String[] args)
	{
		int[][] ar=
			{
				{4,7,8,6,4},
				{6,7,3,9,2},
				{3,8,1,2,4},
				{7,1,7,3,7},
				{2,9,8,9,3}
			};
		MinCostToReachLastCell m = new MinCostToReachLastCell();
		System.out.println(m.findMinCost(ar, ar.length-1, ar[0].length-1));
	}
}	
