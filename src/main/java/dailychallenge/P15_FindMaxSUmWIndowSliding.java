package dailychallenge;

import org.junit.Test;

import junit.framework.Assert;

public class P15_FindMaxSUmWIndowSliding {

	/*
	 * FOr the given array of integers , find the maximum sum of K consecutive
	 * elements in the array K=4
	 * 
	 * input arr [] ={1,7,6,10,23,3,1,0}
	 * 
	 * 
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? int[] arr
	 * 
	 * What is the expected output? int a Do I have constraints to solve the
	 * problem? Solve it using window sliding only Do I have all informations to go
	 * to next step!! How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * Postive : target value available Negative :Target value not avaialble Edge:
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
		int arr[] = { 1, 7, 6, 10, 23, 3, 1, 0 };
		int k = 4;

		Assert.assertEquals(46, ConsecutiveNumbsUsingTwoPointer(arr, k));
	}

	/*
	 * Find the sum of first window , have it as your first window sum. In the next
	 * window , you will drop the first element from the first window and add the
	 * next element available next to kth position of first window .
	 * 
	 * It can be done through --> Adding the next value and subratcting the first
	 * element value from your current window.
	 * 
	 * Have it as your current sum . Compare the two values and keep the max between
	 * them and return the max value at the end of iteration
	 * 
	 * 
	 * Time complexity --> O(n ) -->Space-->O(1)
	 * 
	 * 
	 */
	private int findMaxSumOfConsecutivElements(int[] arr, int k) {

		int windowsum = 0;

		// { 1, 7, 6, 10, 23, 3, 1, 0 }

		for (int i = 0; i < k; i++) {
			windowsum = windowsum + arr[i];
		}

		int currentsum = windowsum;

		for (int i = k; i < arr.length; i++) {
			currentsum += arr[i] - arr[i - k];
			windowsum = Math.max(currentsum, windowsum);

		}

		System.out.println(windowsum);
		return windowsum;

	}

	private int ConsecutiveNumbsUsingTwoPointer(int[] arr, int k) {

		int left = 0;
		int right = k;

		int currentsum = 0;

		int windowsum = 0;

		while (left < right && right < arr.length) {

			for (int i = left; i < right; i++) {
				windowsum = windowsum + arr[i];
			}

			windowsum = Integer.max(currentsum, windowsum);
			currentsum = windowsum;

			windowsum = 0;

			left++;
			right++;
		}

		System.out.println(currentsum);
		return currentsum;

	}

}