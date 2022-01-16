package easy;

import org.junit.Assert;
import org.junit.Test;

public class P94_FirstAndLastPositionOfElement {

	
	//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
	@Test
	public void testcase1() {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		Assert.assertArrayEquals(new int[] {3,4},findFirstAndLastIndex(nums, target) );
	}
	
	@Test
	public void testcase2() {
		int[] nums = { 5, 7, 7, 8, 8, 10};
		int target = 6;
		Assert.assertArrayEquals(new int[] {-1,-1},findFirstAndLastIndex(nums, target) );
	}
	
	@Test
	public void testcase3() {
		int[] nums = {};
		int target = 0;
		Assert.assertArrayEquals(new int[] {-1,-1},findFirstAndLastIndex(nums, target) );
	}

	private int[] findFirstAndLastIndex(int[] nums, int target) {
		if(nums.length==0) return new int[] {-1,-1};
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int leftVal = nums[left];
			int rightVal = nums[right];

			if (leftVal != target && rightVal != target) {
				left++;
				right--;
			}

			else if (leftVal == target && rightVal == target) {

				return new int[] { left, right };
			}

			else if (leftVal == target && rightVal != target) {
				right--;
			}

			else if (leftVal != target && rightVal == target) {
				left++;
			}

		}

		return new int[] { -1, -1 };

	}

}
