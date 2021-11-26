package easy;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class P32_MAxProdDifference {
	
	
	//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
	@Test
	public void testcase1() {
		int[] nums= {5,6,2,7,4};
		Assert.assertEquals(34, findDifference(nums));
	}

	private int findDifference(int[] nums) {
		Arrays.sort(nums);
		
		int maxSum=(nums[nums.length-1]) * (nums[nums.length-2]);
		int minSum=nums[0] *nums[1];
		
		return maxSum-minSum;
		
		
	}

}
