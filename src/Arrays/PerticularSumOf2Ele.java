
package Arrays;
import java.util.Arrays;
class PerticularSumOf2Ele {
	
	/*
	 * Write a program to find all pairs of integers whose sum is equal to a given
	 * number.
	 * 
	 * Examples
	 * 
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
	 * nums[1] == 9, we return [0, 1]
	 * 
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2]
	 */
  public static void main(String[] args)
  {
	  PerticularSumOf2Ele mn = new PerticularSumOf2Ele();
    int[] intArray = {2,8,7,9};
    int[] result = mn.twoSum(intArray, 15);
    System.out.println(Arrays.toString(result));
  }

  
  public int[] twoSum(int[] nums, int target)
  {
	  for(int i=0;i<nums.length-1;i++)
	  {
		  for(int j=i+1;j<=nums.length-1;j++)
		  {
			  if(nums[i]+nums[j]==target)
				  return new int[] {i,j};
		  }
	  }
	  return null;
  }

}
