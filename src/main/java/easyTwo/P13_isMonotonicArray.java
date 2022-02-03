package easyTwo;

import org.junit.Test;

import junit.framework.Assert;

public class P13_isMonotonicArray {
	
	
	@Test
	public void tetscase1() {
		int[] nums = {1,2,2,3};
		Assert.assertEquals(false, isMonotonic(nums));
	}
	
	@Test
	public void tetscase2() {
		int[] nums = {6,5,4,4};
		Assert.assertEquals(false, isMonotonic(nums));
	}
	
	@Test
	public void tetscase3() {
		int[] nums = {2,3};
		Assert.assertEquals(true, isMonotonic(nums));
	}
	

	private boolean isMonotonic(int[] nums) {
		boolean increasing = isIncreasing(nums);
		boolean decreasing = isDecreasing(nums);
		
		if(increasing ==true|| decreasing ==true) return true;
		return false;
		
	}


	private boolean isDecreasing(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i+1]>=nums[i]) return false;
		}
		return true;
		
	}


	private boolean isIncreasing(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]>=nums[i+1]) return false;
		}
		return true;
	}

}
