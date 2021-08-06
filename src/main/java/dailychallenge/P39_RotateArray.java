package dailychallenge;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P39_RotateArray {

	/*
	 * https://leetcode.com/problems/rotate-array/
	 */


	@Test
	public void testcase1() {
		int nums[] = {1,2,3,4,5,6,7};
		int k=3;
		Assert.assertArrayEquals(new int[] {5, 6, 7, 1, 2, 3,4}, rotateArray(nums, k));
		}


	/*1.Reverse the entire array
	 * 2.Reverse first k elements
	 * 3. reverse the second k elements
	*/
	private int[] rotateArray(int[] nums, int k) {
		k%=nums.length;

		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		System.out.println(Arrays.toString(nums));
		return nums;
	}

	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}



	}

}
