package slidingwindow;

import org.junit.Test;

import junit.framework.Assert;

public class P09_MaxAscendingSubArrSum {
	
	@Test
	public void testcase1() {
		int[] nums = {10,20,30,5,10,50};
		Assert.assertEquals(65, findMaxSum(nums));
	}
	
	@Test
	public void testcase2() {
		int[] nums = {10,20,30,40,50};
		Assert.assertEquals(150, findMaxSum(nums));
	}
	
	@Test
	public void testcase3() {
		int[] nums = {12,17,15,13,10,11,12};
		Assert.assertEquals(33, findMaxSum(nums));
	}
	
	@Test
	public void testcase4() {
		int[] nums = {100,10,1};
		Assert.assertEquals(100, findMaxSum(nums));
	}
	
	@Test
	public void testcase5() {
		int[] nums = {3,6,10,1,8,9,9,8,9};
		Assert.assertEquals(19, findMaxSum(nums));
	}
	
	
	
	/*
	 * int left=0,right=0, max=Integer.MIN_VALUE,sum=0;
	 * 
	 * //12,17,15,13,10,11,12
	 * 
	 * while(right<nums.length) { int leftVal = nums[left]; int
	 * rightVal=nums[right]; if(rightVal>=leftVal) { sum+=rightVal; right++; }
	 * 
	 * else if(rightVal<leftVal) { left=right; max=Math.max(sum, max); sum=0; } }
	 * 
	 * max=Math.max(sum, max); System.out.println(max); return max;
	 */

	private int findMaxSum(int[] nums) {
		//int[] nums = {10,20,30,5,10,50};
		
		//[3,6,10,1,8,9,9,8,9]
		
		
		int left=0,right=1,sum=nums[0];
		int max=Integer.MIN_VALUE;
		
		while(right<nums.length) {
			int leftVal= nums[left];
			int rightVal=nums[right];
			
			if(rightVal>leftVal) {
				sum+=rightVal;
				left++;
				right++;
			}
			
			else if(rightVal<=leftVal) {
				max=Math.max(max, sum);
				left=right;
				sum=nums[left];
				right++;
			}
			
			max=Math.max(max, sum);
		}
		
		
		System.out.println(max=Math.max(max, sum));
		
		return max;

	}

}
