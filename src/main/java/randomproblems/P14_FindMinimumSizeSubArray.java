package randomproblems;

import org.junit.Test;

import junit.framework.Assert;

public class P14_FindMinimumSizeSubArray {

	/*
	 * https://leetcode.com/problems/minimum-size-subarray-sum/
	 */

	@Test
	public void testcase1() {
		int[] nums = {2,3,1,2,4,3};
		int target=7;
		Assert.assertEquals(2, findMinimumSize(nums,target));;
	}

	private int findMinimumSize(int[] nums, int target) {
		int windowStart=0;
		int minSize=Integer.MAX_VALUE;
		int sum=0;
		for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			int inputValue = nums[windowEnd];
			sum += inputValue;
			while (sum >= target) {
				int leftValue = nums[windowStart];
				minSize = Math.min(minSize, windowEnd - windowStart + 1);
				sum -= leftValue;
				windowStart++;
			}
		}
		 if(minSize==Integer.MAX_VALUE) return 0;
		System.out.println(minSize);
		return minSize;
	}

}
