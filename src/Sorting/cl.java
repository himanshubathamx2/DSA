package Sorting;

public class cl
{

	public static void main(String[] args)
	{
		int[] arr= new int[] {2,5,1,8,4,3,7,3};
		int[] bubbleSort = BubbleSort.bubbleSort(arr);
		for(int n:bubbleSort) {
			System.out.println(n);
		}
	}

}
