package twoPointer;

import org.junit.Assert;
import org.junit.Test;

public class P02_TwoSum {
	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
	 * nums[1] == 9, we return [0, 1].
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2]
	 * 
	 * Input: nums = [3,3], target = 6 Output: [0,1]
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * If sum of the values are equal to to target value , return the indeces .
	 * 
	 * What is the input(s)? intarr[] , int target What is the expected output?
	 * intarr{a,b} Do I have constraints to solve the problem?
	 * 
	 * Solve i using Two pointer
	 * 
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * Positive : Negative : Edge :
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate? No - Can I break down the problem into
	 * sub problems?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well?
	 * 
	 * Yes - What are those? No - That is still fine, proceed to solve by what you
	 * know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !! /
	 * 
	 * 
	 * 
	 */
	@Test
	public void testcase1() {
		int[] intarr = { 2, 7, 11, 15 };
		int target = 9;

		Assert.assertArrayEquals(new int[] { 0, 1 }, findTwoSumUsingTwoPointer(intarr, target));
	}

	@Test
	public void testcase2() {
		int[] intarr = { 2, 7, 11, 15 };
		int target = 17;

		Assert.assertArrayEquals(new int[] { 0, 3 }, findTwoSumUsingTwoPointer(intarr, target));
	}

	@Test
	public void testcase3() {
		int[] intarr = { 2, 7, 11, 15 };
		int target = 6;

		Assert.assertArrayEquals(new int[] { -1, -1 }, findTwoSumUsingTwoPointer(intarr, target));
	}

	@Test
	public void testcase4() {
		int[] intarr = { 2,3, 4 };
		int target = 6;

		Assert.assertArrayEquals(new int[] { 0, 2 }, findTwoSumUsingTwoPointer(intarr, target));
	}

	@Test
	public void testcase5() {
		int[] intarr = { 2, 5, 5, 11 };
		int target = 10;

		Assert.assertArrayEquals(new int[] { 1, 2 }, findTwoSumUsingTwoPointer(intarr, target));
	}
	
	
	/*left-->0, right --> arrlen-1;
	 * if sum of left and right is equal to target return index of left and right
	 * If sum < target move left++
	 * if sum greater than target , move right--
	 * 
	 * 
	 * Time complexity-->less than  O(n) , space complexity-->O(1)
	
	
	
	*/
	private int[] findTwoSumUsingTwoPointer(int[] intarr, int target) {
		int left = 0, right = intarr.length - 1;

		while (left <= right) {

			if (intarr[left] + intarr[right] == target)
				return new int[] { left, right };
			
			else if (intarr[left] + intarr[right] < target)
				left++;
			
			else if (intarr[left] + intarr[right] >target)
				right--;

		}
		return new int[] { -1, -1 };

	}
}
