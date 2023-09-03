package DivideNConquer.NumberOfPathToReachGivenCell;

public class cl
{

	public static void main(String[] args)
	{
		int[][] ar=
			{
				{4,7,1,6},
				{5,7,3,9},
				{3,2,1,2},
				{7,1,6,3}
			};
		int cost=25;
		NumberOfPathsToReachLastCell n= new NumberOfPathsToReachLastCell();
		System.out.println(n.numberOfPaths(ar, ar.length-1, ar[0].length-1, cost));

	}

}
