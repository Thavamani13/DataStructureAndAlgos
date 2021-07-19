package binarySearch;

import org.junit.Test;

import junit.framework.Assert;

public class P03_FindPeakElement {

	/*
	 * A peak element is an element that is strictly greater than its neighbors.
	 * Given an integer array nums, find a peak element, and return its index. If
	 * the array contains multiple peaks, return the index to any of the peaks.
	 * 
	 * You may imagine that nums[-1] = nums[n] = -∞.
	 * 
	 * You must write an algorithm that runs in O(log n) time.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3,1] Output: 2 Explanation: 3 is a peak element and your
	 * function should return the index number 2. Example 2:
	 * 
	 * Input: nums = [1,2,1,3,5,6,4] Output: 5 Explanation: Your function can return
	 * either index number 1 where the peak element is 2, or index number 5 where
	 * the peak element is 6.
	 * 
	 * https://docs.google.com/spreadsheets/d/1pjtfZu9at0bjmc5EKn_ce34itQeapfGkDZL24NYpAZg/edit?pli=1#gid=0
	 * 
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)?int[] intarr , What is the expected output? int a Do I
	 * have constraints to solve the problem?
	 * 
	 * Solve it using O(log n) time.
	 * 
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions Positive :Peak
	 * element occurs Negative : no peak element Edge : Duplicate elements
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
		int[] intarr = { 1, 2, 3, 1 };
		Assert.assertEquals(2, findPeakElement(intarr));

	}

	@Test
	public void testcase2() {

		int[] intarr = { 1, 2, 1, 3, 5, 6, 4 };
		Assert.assertEquals(5, findPeakElement(intarr));

	}

	private int findPeakElement(int[] intarr) {
		int low = 0, high = intarr.length - 1;

		while (low < high) {
			int mid = (low + high) / 2;
			if (intarr[mid] > intarr[mid + 1]) {
				high = mid;
			} else {
				low = mid + 1;
			}

		}

		System.out.println(low);
		return low;

	}

}
