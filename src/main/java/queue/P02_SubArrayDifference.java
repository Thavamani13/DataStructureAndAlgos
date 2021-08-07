package queue;

import org.junit.Test;

public class P02_SubArrayDifference {


	@Test
	public void testcase1() {
		int[] intarr= {8,2,4,7};
		int k =4;
		System.out.println(findAbsdifference(intarr,k));

	}




	/*define min quue and max quue
	 * // keep left and right at 0,
	 *
	 * // traverse through the array and find the abs diff
	 *
	 * // iff abs difference between left and right // if difference is <= limit
	 * value, add the elemenmt into minque // increment right
	 *
	 *
	 * // if difference is >limit value, poll the element from minque and offer to
	 * maxque. increment left
	 */

	private int findAbsdifference(int[] nums, int limit) {
		int left = 0, right = 0;
		int longest = Integer.MIN_VALUE, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		while(left < nums.length && right < nums.length) {

		// find the min and max for the absolute difference
		min = Math.min(min, Math.min(nums[left], nums[right]));
		max = Math.max(max, Math.max(nums[left], nums[right]));

		// Check with the limit
		if(Math.abs(max-min) <= limit) {
		longest = Math.max(longest, right-left+1);
		right++;
		} else {
		right = ++left;
		min = nums[left];
		max = nums[left];
		}

		}
		return longest;

		}
}