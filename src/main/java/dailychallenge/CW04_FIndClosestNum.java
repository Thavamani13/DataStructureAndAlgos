package dailychallenge;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class CW04_FIndClosestNum {

	/*
	 * Input: nums = [34,23,1,24,75,33,54,8], k = 60 Output: 58 Explanation: We can
	 * use 34 and 24 to sum 58 which is less than 60.
	 * 
	 * Example 2:Input: nums = [10,20,30], k = 15
	 */
	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
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
	 */

	@Test
	public void testcase1() {
		int[] arr = { 34, 23, 1, 24, 75, 33, 54, 8 };
		int target = 60;

		Assert.assertEquals(58, findClosestNumUsingTwoPointer(arr, target));

	}

	@Test
	public void testcase2() {
		int[] arr = { 10, 20, -30 };
		int target = -5;

		Assert.assertEquals(-10, findClosestNumUsingTwoPointer(arr, target));

	}

	/*
	 * nested for loop to finnd the sum of two numbers See if it less than target.
	 * Save the number as Current Max Return the current Max at the end of the
	 * iteration
	 * 
	 * Time complexity --> O(n^2) Space Complexity --> O(1)
	 * 
	 */

	private int findClosesetNumberUsingBruteForce(int[] arr, int target) {

		int sum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (i != j && arr[i] + arr[j] < target) {

					sum = Math.max(sum, arr[i] + arr[j]);
				}

			}

			System.out.println(sum);
			return sum;

		}
		return 0;
	}

	private int findClosestNumUsingTwoPointer(int[] arr, int target) {

		Arrays.sort(arr);

		int sum = Integer.MIN_VALUE;
		int left = 0, right = arr.length - 1;

		while (left < right) {
			int currentsum = arr[left] + arr[right];

			if (sum < target) {
				sum = Math.max(sum, currentsum);
				left++;

			}

			else
				right--;

		}
		return sum;

	}

}
