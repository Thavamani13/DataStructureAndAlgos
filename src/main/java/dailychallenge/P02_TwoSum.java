package dailychallenge;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P02_TwoSum {

	/**
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * 
	 * 
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * 
	 * 
	 * What is the input(s)? What is the expected output? input arr[] ,
	 * output--arr[2]
	 * 
	 * Do I have constraints to solve the problem? Do I have all informations to go
	 * to next step!! How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * positive:Ther sum of two gets the desired result Negative:There sum of two
	 * number does not the desired result return {-1,-1} Edge :Empty array , *
	 * 
	 * 
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
		int[] arr = { 2, 7, 11, 15 };
		int k = 9;

		Assert.assertArrayEquals(new int[] { 0, 1 }, findTwoSumBruteForce(arr, k));
	}

	@Test
	public void testcase2() {
		int[] arr = { 3, 2, 4 };
		int k = 6;

		Assert.assertArrayEquals(new int[] { 0, 2 }, twoSumUsingTwoPointers(arr, k));
	}

	@Test
	public void testcase3() {
		int[] arr = { 2, 7, 11, 15 };
		int k = 45;

		Assert.assertArrayEquals(new int[] { -1, -1 }, twoSumUsingTwoPointers(arr, k));
	}

	/*
	 * loop through the given array and add the one element with the next one .
	 * Check if the sum value is equal to target , Yes --> return the indexes
	 * 
	 * 
	 */

	/*
	 * Time complexity --> O(n2) SpaceComplexity --->O(1)
	 * 
	 */

	private int[] findTwoSumBruteForce(int[] arr, int k) {

		int[] newarr = new int[2];

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == k) {

					newarr[0] = i;
					newarr[1] = j;

					System.out.println(Arrays.toString(newarr));

					return newarr;
				}

			}

		}

		return new int[] { -1, -1 };

	}

	public int[] twoSumUsingTwoPointers(int[] arr, int k) {
		
		/*int[] arr = { 3, 2, 4 };
		int k = 6;*/

		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;

		while (left < right) {

			if (arr[left] + arr[right] == k) {

				System.out.println(Arrays.toString(new int[] { left, right }));
				return new int[] { left, right };

			}

			else if (arr[left] + arr[right] < k) {

				left++;
			} else
				right--;

		}
		return new int[] { -1, -1 };

	}

}
