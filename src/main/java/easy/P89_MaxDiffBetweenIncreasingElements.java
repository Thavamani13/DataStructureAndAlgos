package easy;

import org.junit.Test;

public class P89_MaxDiffBetweenIncreasingElements {
	
	//https://leetcode.com/problems/maximum-difference-between-increasing-elements/
	
	@Test
	public void testcase1() {
		int[] nums = {7,1,5,4};
		findMaxDiff(nums);
	}
	
	@Test
	public void testcase2() {
		int[] nums = {9,4,3,2};
		findMaxDiff(nums);
	}

	
	private void findMaxDiff(int[] nums) {
		
		int max=Integer.MIN_VALUE;
		for (int j = 0; j < nums.length-1; j++) {
			int leftVal=nums[j];
			for (int i = j+1; i < nums.length; i++) {
				int rightVal=nums[i];
				int difference =Math.abs(nums[j]-nums[i]);
				if(j<i&& rightVal>leftVal) {
					max=Math.max(max, difference);
				}
			}
		}
	
		System.out.println(max);
		
	}

}
