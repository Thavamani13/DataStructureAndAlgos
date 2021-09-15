package leetcodeeasy;

import org.junit.Test;

import junit.framework.Assert;

public class P29_MinSizeSubArrSumWS {

	@Test
	public void testcase1() {
		int[] nums = {2,3,1,2,4,3};
		int target =7;
		Assert.assertEquals(2, findMinSum(nums,target));
	}

	@Test
	public void testcase2() {
		int[] nums = {1,4,4};
		int target =4;
		Assert.assertEquals(1, findMinSum(nums,target));
	}


	@Test
	public void testcase3() {
		int[] nums = {1,1,1,1,1,1,1,1};
		int target =11;
		Assert.assertEquals(0, findMinSum(nums,target));
	}

	/*Traverse through the array
	 * if the sum is greater than or equal to target
	 *      track the min  windowlength and shrink the window
	 *
	 * return the min windowlength
	 */

	private int findMinSum(int[] nums, int target) {
		int windowStart=0,sum=0,min=Integer.MAX_VALUE;
		for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			int inputVal=nums[windowEnd];
			sum+=inputVal;

			while(sum>=target) {
				int leftVal=nums[windowStart];
				min=Math.min(min, windowEnd-windowStart+1);
				sum-=leftVal;
				windowStart++;
			}


		}

		System.out.println(min);
		return min != Integer.MAX_VALUE ? min : 0;
	}

}
