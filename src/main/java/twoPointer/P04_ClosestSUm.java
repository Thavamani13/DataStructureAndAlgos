package twoPointer;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class P04_ClosestSUm {

	/*
	 * P1) Given an array nums of integers and integer k, return the maximum sum
	 * such that there exists i < j with nums[i] + nums[j] = sum and sum < k. If no
	 * i, j exist satisfying this equation, return -1.   Example 1:
	 * 
	 * Input: nums = [34,23,1,24,75,33,54,8], k = 60 Output: 58 Explanation: We can
	 * use 34 and 24 to sum 58 which is less than 60.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [10,20,30], k = 15 Output: -1 Explanation: In this case it is
	 * not possible to get a pair sum less that 15.
	 * 
	 * 
	 * 1,8,23,24,33,34,54,75
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? intarr[] , int target What is the expected output? int
	 * closestsum Do I have constraints to solve the problem?
	 * 
	 * Use two pointers
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
		int[] intarr = { 34, 23, 1, 24, 75, 33, 54, 8 };
		int k = 60;
		Assert.assertEquals(58, findClosestSumUsingTwoPointer(intarr, k));
	}

	@Test
	public void testcase2() {
		int[] intarr = { 34, 23, 1, 24, 75, 33, 54, 8 };
		int k = 25;
		Assert.assertEquals(24, findClosestSumUsingTwoPointer(intarr, k));
	}

	@Test
	public void testcas3() {
		int[] intarr = { 34, 23, 1, 24, 75, 33, 54, 8 };
		int k = 10;
		Assert.assertEquals(9, findClosestSumUsingTwoPointer(intarr, k));
	}
	
	/*
	 * left-->0 , right -->last index	 * 
	 * sum of left + right<target .. keep as curent max & increment left	 * 
	 * else --> decrement right	 * 
	 * COntinue untill left<right* 
	 * 
	 */

	private int findClosestSumUsingTwoPointer(int[] intarr, int k) {
		// 1,8,23,24,33,34,54,75
		
		if (intarr.length==1) throw new RuntimeException("Invalid input");		

		Arrays.sort(intarr);

		int left = 0, right = intarr.length - 1;

		int max = Integer.MIN_VALUE;

		while (left < right) {

			int sum = intarr[left] + intarr[right];

			if (sum < k) {
				max = Integer.max(max, intarr[left] + intarr[right]);
				left++;
			} else {
				right--;

			}

		}

		System.out.println(max);
		return max;

	}

}
